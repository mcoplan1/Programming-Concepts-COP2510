// ****************************************************************
//	Matthew Coplan 
//	Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
// ****************************************************************

import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
	int SALESPEOPLE = 0;
	int sum;
   int avg; //avg amount of sales
   int value; //grab a value from the user to compare to each salesperson
   int count; // total number of people who exceeded sales

	Scanner scan = new Scanner(System.in);
   System.out.println("Enter the total number of salespersons in the company: ");
   SALESPEOPLE = scan.nextInt();
   
   int[] sales = new int[SALESPEOPLE];

   //First Loop
   for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();
	    }

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	
   //Initalize
   sum = 0;
   count=0;
   int max= sales[0]; // max sale
   int min= sales[0]; // min sale
   
   //Second Loop + min and max sale
	for (int i=0; i<sales.length; i++)
	    {
		System.out.println("     " + (i+1) + "         " + sales[i]);
		sum += sales[i];
      
      if(sales[i]>max)
         max = sales[i];
       
      if(sales[i]<=min)
         min = sales[i];
	    }

	System.out.println("\nTotal sales: " + sum);
   //avg amount of sales
   avg = sum / 5;
   System.out.println("Average sales: " +avg);
   //max sale
   System.out.println("Maximum sale: " + max);
   //min sale
   System.out.println("Minimum sale: " + min);
    
   //grab a value to compare to salespersons
   System.out.println("Enter a number of sales to compare to each of the salesperson: ");
   value = scan.nextInt();
   
   System.out.println("\nSalesperson  Sales");
   System.out.println("---------------------");


   for (int i=0; i<sales.length; i++)
      {
      if (value<sales[i]){
      System.out.println("    " + (i+1) + "     " +sales[i]);
      count++;
         }
      
      } 
     System.out.println("The total number of people who exceeded " + value +" amount of sales are: " +count);     
    
    }
    
}
 

