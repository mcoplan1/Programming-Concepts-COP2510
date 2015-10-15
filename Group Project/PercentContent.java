//************************************************************************************
//	Matthew Coplan + Damani Obie
//
//	%G~C Content Calculator Program
//  ContentCalculator.java
//
//	This program computes the %G~C Content of a DNA sequence
//************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormat;


public class PercentContent
   {
      public static void main (String[] args)
      {
         String phrase;
         int countA, countT, countG, countC, countTotal, countOther;
         int total; //Total number of A T G C's
         int length; // length of phrase
         double percentContent; // %G-C Content / Total
         char ch;
         
         Scanner scan = new Scanner(System.in);
         DecimalFormat fmt = new DecimalFormat ("0.##");
         
         //Program Header
         System.out.println("This program computes %G-C Content in a DNA Sequence");
         System.out.println("Please enter a DNA Sequence");
         
         //Grab information from user
         phrase = scan.nextLine();
         length = phrase.length();
         
         //Initialize Counts
         countA = 0;
         countT = 0;
         countG = 0;
         countC = 0;
         countTotal = 0;
         countOther = 0;
         
         //Switch Statement with loop
         for (int i = 0; i < phrase.length(); i++)
         {
            ch = phrase.charAt(i);
            
            if( ch>= 'A' && ch<= 'Z')
            countTotal++;
            
               switch (ch)
               {
               case 'a':
               case 'A': countA++;
                        break;
               case 't':
               case 'T': countT++;
                        break;
               case 'g':
               case 'G': countG++;
                        break;
               case 'c':
               case 'C': countC++;
                        break;
               default:
                       System.out.println("This character will not be counted towards the total: " + phrase.charAt(i));
                       countOther++;
                       break;
               }
          }
             
          //Print Statements
          System.out.println("Number of A's in the DNA Sequence: " +countA);
          System.out.println("Number of T's in the DNA Sequence: " +countT);
          System.out.println("Number of G's in the DNA Sequence: " +countG);
          System.out.println("Number of C's in the DnA Sequence: " +countC);
          System.out.println("Total number in the DNA Sequence: " +countTotal); 
          total = countTotal - countOther;
          System.out.println("Total number of A T G C's: " +total);
          
          percentContent = ((double)(countG + countC)/(total))*100;
          
          
          System.out.println("The %G-C Content is: " + fmt.format(percentContent) + "%");
    }
}

              
                     