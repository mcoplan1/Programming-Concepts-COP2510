//*************************************************
//	Matthew Coplan	
//	approximatingpi.java
//
//	This program approximates pi
//*************************************************


import java.util.Scanner;
import java.util.Random;

public class ApproximatingPI
{
  public static void main (String[] args)
  {
      float x;
      float y;
      float distance;
      int darts;
      int dartsInside;
      double PI;
      
      //Scanner and Randon
      
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      
      //Explain program
      System.out.println("This program approximates PI");
      System.out.println("Please enter the total number of darts you wish to use");
      darts = scan.nextInt();
      
      //loop
      dartsInside = 0;
      for (int i=0; i < darts; i++)
         {
         x = generator.nextFloat();
         y = generator.nextFloat();
         
         distance = ((x*x) + (y*y));
            if (distance < 1.0){
            dartsInside++;
            }
          }
       
       //Area is PI/4, darts * 4 = pi
       
       PI = ((4.0 * dartsInside) / darts);
       System.out.println("PI is Approximately " +PI);
 }
}