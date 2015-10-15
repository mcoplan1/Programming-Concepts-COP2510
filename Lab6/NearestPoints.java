// *********************************************************************
//	Matthew Coplan
//	NearestPoints.java
//
// This program computes the distances between all pairs of 
// points and finds the one with the minimum distance 
// *********************************************************************

import java.util.Scanner;

public class NearestPoints
{
   public static void main(String[] args)
   {
   int POINTS = 0;
   double distance;
   double shortestDistance = 0;
   double x, y; //values of x and y at first two points
   double x2, y2; //values of x and y to compare w/ first distance
   int pointOne = 0; 
   int pointTwo = 0;
   
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the total number of points: ");
   POINTS = scan.nextInt();
   
   double[][] position = new double[POINTS][2];
   
   // Grab inputs from user
   for (int i= 0; i<position.length; i++)
     {
      for (int j = 0; j < position[i].length; j++)
         {
         System.out.println("Enter the x and y values for point number: "+ (i+1));
         position[i][j] = scan.nextDouble();
         }
     }
   //Calculating distance at first two points
   x = (position[0][0] - position[1][0]);
   y = (position[0][1] - position[1][1]);
   shortestDistance = (Math.sqrt((x*x))+(y*y));
   
   // Nested for-loop to find shortestDistance between all the points
   for(int i = 0; i < position.length; i++)
      {
         for (int j = i + 1; j < position.length; j++)
         {
            x2 = position[i][0] - position[j][0];
            y2 = position[i][1] - position[j][1];
            distance = Math.sqrt((x2*x2) + (y2*y2));
            
            if (shortestDistance > distance){
               pointOne = i;
               pointTwo = j;
               shortestDistance = distance;
               }
          }
       }
   System.out.println("The shortested distance is: " + shortestDistance);
   System.out.println("The closest two points are: " + "(" + position[pointOne][0] + "," + position[pointTwo][1] + ")" +
                      "(" + position[pointTwo][0] + "," + position[pointTwo][1] + ")" );
   
   }
      
}    

     	         
     
   
   
   
   