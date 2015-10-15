//********************************************************************
// Lab Exam #2
// CellPhone.java
//
// This Program calculates the total cost of a cell phone service
// Matthew Coplan
//********************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class CellPhone
{
   public static void main (String[] args)
   {
   // variables required for the program
   int option; // user input to recieve number
   double baseCost = 10.99; //base cost of the plan
   int firstChoice; 
   int secondChoice;
   int thirdChoice;
   int fourthChoice;  //(1-4) Choices for the program
   double cost1,cost2,cost3,cost4; //calculating individual plan costs
   double totalCost; // total cost of the cell phone plan
   
   Scanner scan = new Scanner (System.in);
   
   // explain to the user what the program is about   
   System.out.println("This program calcuates the Total Cost of our cell phone plan" 
                     + "via the packages you choose");
   System.out.println("The base cost of the cellphone plane is 10.99");
   System.out.println("Choose one or more of the following packages: (or 0 to exit)");
   System.out.println("1	1,000 anytime minutes: 25.49");
   System.out.println("2	Unlimited weekend minutes: 6.99");
   System.out.println("3	Nationwide long distance: 12.99"); 
   System.out.println("4	Text messaging: 5.99");
   
   option = scan.nextInt();
    
   // initalize values
   firstChoice = 0;
   secondChoice = 0;
   thirdChoice = 0;
   fourthChoice = 0;
   cost1 = 0;
   cost2 = 0;
   cost3 = 0;
   cost4 = 0;
   
   // loop for the choices
   
   while (option != 0) {
      
         switch (option) {
            case 1:
                  System.out.println("Option one selected");
                  firstChoice++;
                  break;
            case 2:
                  System.out.println("Option two selected");
                  secondChoice++;
                  break;
            case 3:
                  System.out.println("Option three selected");
                  thirdChoice++;
                  break;
            case 4:
                  System.out.println("Option four selected");
                  fourthChoice++;
                  break;
            default:
                  System.out.println("Incorrect Entry, please enter a value between 1 - 4");
             }
            
             System.out.println("Choose one or more of the following packages: (or 0 to exit)");
             option = scan.nextInt();
         }
      
      // if statement to calculate the cost of each option 
      
      if (firstChoice >= 1)
        cost1 = (double)firstChoice * 25.49;
      
      if (secondChoice >=1)
         cost2 = (double)secondChoice * 6.99;
      
      if (thirdChoice >= 1)
         cost3 = (double)thirdChoice * 12.99;
    
      if (fourthChoice >= 1)
          cost4 = (double)fourthChoice * 5.99;
       
      //total cost calculation and NumberFormat
               
      totalCost = (baseCost + cost1 + cost2 + cost3 + cost4);
      
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      System.out.println("Total cost of the plan: " + fmt.format(totalCost));

   }
}