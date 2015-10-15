// ***************************************************************
//  Matthew Coplan
//  LoanPayment.java
//
//  This program computes loan payments for different types of loans
// ***************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class LoanPayment
{
   public static void main (String[] args)
   {
      double annualInterestRate;
      int numberOfYears;
      double loanAmount;
      double monthlyInterestRate;
      double monthlyInterestRateEquation1; //spilt up for calculations
      double monthlyInterestRateEquation2; //spilt up for calculations
      double monthlyPayment;
      double monthlyPaymentEquation1; //spilt up the calculations
      double monthlyPaymentEquation2; //spilt up the calculations
      double totalPayment;
      
      Scanner scan = new Scanner(System.in);
      
      NumberFormat money = NumberFormat.getCurrencyInstance();
      
      System.out.println("This Program will computer the monthly payment " + 
                           "and total payment from interest rates");
      //Gather information about annual interest rate in decimal form.
      System.out.println("Please enter the Annual Interest Rate in decimal format");
      annualInterestRate = scan.nextDouble();
      
      //Gather information about number of years of the loan duration.
      System.out.println("Please enter the duration of the loan in years");
      numberOfYears = scan.nextInt();
      
      //Gather information about the amount of the loan.
      System.out.println("Please enter the amount of the loan");
      loanAmount = scan.nextDouble();
      
      //Calculations for monthlyInterestRate, monthlyPayment, and totalPayment.
      monthlyInterestRate = annualInterestRate / 12;
      monthlyInterestRateEquation1 = (numberOfYears * 12); // the root of the term
      // term being raised the the root
      monthlyInterestRateEquation2 = Math.pow(1 + monthlyInterestRate, monthlyInterestRateEquation1);      
      monthlyPaymentEquation1 = (loanAmount * monthlyInterestRate); // first part of the equation
      monthlyPaymentEquation2 = (1 - (1 /(monthlyInterestRateEquation2)));  // second part of the equation
      monthlyPayment = (monthlyPaymentEquation1 / monthlyPaymentEquation2); // whole equation
      totalPayment = (monthlyPayment * 12 * numberOfYears); // total payment
      
      //Output for the program
      System.out.println("Monthly Payment: " + money.format(monthlyPayment));
      System.out.println("Total Payment: " + money.format(totalPayment));
         
    }
}                  