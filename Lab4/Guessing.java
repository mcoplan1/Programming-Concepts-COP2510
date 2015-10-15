//*******************************************************************
//  Matthew Coplan
//	Guessing.java      
//
//	This program plays a guessing game with the user
//*******************************************************************

import java.util.Random;
import java.util.Scanner;

public class Guessing
{
//-----------------------------------------------------------------
//  Plays a simple guessing game with the user.   
//-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int MAX = 10;
      int answer, guess;

      Scanner scan = new Scanner (System.in);
      Random generator = new Random();
	  // create a random number between 1 and MAX and store it in answer
      answer = generator.nextInt(MAX) + 1;


      System.out.print ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");

      guess = scan.nextInt();


// complete the while loop so that the program will keep 
// asking the user to try again until the user’s guess 
// is correct
      
while (guess != answer)
{
//print the message    your guess is not correct
   System.out.println("You were incorrect, try again!");


   // ask the user the try again and read in the number
   System.out.print ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");

   guess = scan.nextInt();
	

      }

      
      System.out.println ("You got it! Good guessing!");
      

   }
}
