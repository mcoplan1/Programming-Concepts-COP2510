//***************************************************************
//	Matthew Coplan
//	Paint.java
//
//	Determine how much paint is needed to paint the walls 
//	of a room given its length, width, and height
//***************************************************************

import java.util.Scanner;

public class Paint
{

    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal

        int length;
        int width;
        int height;
        int windows;
        int doors;
        double area1;
        double area2;
        double totalSqft;
        double paintNeeded;
        
        Scanner scan = new Scanner(System.in);

	     System.out.println ("Enter the length of the room ");
        length = scan.nextInt();
        
        System.out.println ("Enter the width of the room ");
        width = scan.nextInt();
        
        System.out.println ("Enter the height of the room ");
        height = scan.nextInt();
        
        System.out.println ("How many windows does the room have ");
        windows = scan.nextInt();
        
        System.out.println ("How many doors does the room have ");
        doors = scan.nextInt();
        //computing totalSqft with windows and doors
        area1= windows + doors;
        
        area2 = length * width * height;
        
        totalSqft = area2 - area1;
        
        System.out.println ("The total square feet to be painted is " + totalSqft
                             + " sqft");
        
        paintNeeded = totalSqft / COVERAGE;
        System.out.println ("The amount of paint needed for the room is " + paintNeeded 
                             + " gal");
        System.out.println ("The following dimensions and gallons needed for the room is,"
                             + " length: " + length + " width: " + width + " height: " + height +
                             " Paint needed: " + paintNeeded + " gal");

    }
}
