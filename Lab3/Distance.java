// ********************************************************
//	Matthew Coplan 
//	Distance.java
//
// Computes the distance between two points
// ********************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance
   {
   
      public static void main (String[] args)
      {
      double x1; // first x value
      double x2; // second x value
      double y1; // first y value
      double y2; // second y value
      double calc1;
      double calc2;
      double sq1;
      double sq2;
      double distance; // first distance
      
      Scanner scan = new Scanner (System.in);
      DecimalFormat fmt = new DecimalFormat ("0.###");
      
      
      System.out.println ("This program computes the distance between two points");
      System.out.println ("Enter the first x value: ");
      x1 = scan.nextDouble();
      
      System.out.println ("Enter the first y value: ");
      y1 = scan.nextDouble();
      
      System.out.println ("Enter the second x value: ");
      x2 = scan.nextDouble();
      
      System.out.println ("Enter the second y value: ");
      y2 = scan.nextDouble();
      
      //Calculations
      calc1 = x1-x2;
      calc2 = y1-y2;
      sq1 = Math.pow(calc1, 2);
      sq2 = Math.pow(calc2, 2);
      distance = Math.sqrt(sq1 + sq2);
      
      System.out.println ("The distance between the two points is: " + fmt.format(distance));
      
      
      }
      
  }