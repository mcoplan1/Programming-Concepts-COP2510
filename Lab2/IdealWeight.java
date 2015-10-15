//***************************************************************
//	Matthew Coplan	
//	IdealWeight.java
//
//	To compute the ideal weight of both male and females 
//         above 5 feet tall
//***************************************************************

import java.util.Scanner;

public class IdealWeight
{

    public static void main(String[] args)
    {
       int heightFeet;
       int heightInches;
       int heightInches2;
       int maleHeightInches;
       int femaleHeightInches;
       int maleIdealWeight;
       int femaleIdealWeight;
       
       Scanner scan = new Scanner (System.in);
       System.out.println ("This program computes Ideal Weights of males and females over 5 feet");
       System.out.println ("Enter your height in feet and inches ");
       heightFeet = scan.nextInt();
       heightInches = scan.nextInt();
       
       femaleIdealWeight = (5 * heightInches) + 100;
       maleIdealWeight = (6 * heightInches) + 106;
               
       System.out.println ("The Ideal Weight for feet: " + heightFeet + " and inches: "
       + heightInches + " is female: " + femaleIdealWeight + " and male: " + maleIdealWeight);
    
        
    }
}