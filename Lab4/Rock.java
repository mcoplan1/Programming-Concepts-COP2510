// ****************************************************************
//   Matthew Coplan
//	 Rock.java
//
//   Play Rock, Paper, Scissors with the user         
// ****************************************************************

import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
   String personPlay;          //User's play -- "R", "P", or "S"
	String computerPlay;   //Computer's play -- "R", "P", or "S"
	int computerInt;            //Randomly generated number used to determine
	                            //computer's play

   Scanner scan = new Scanner(System.in);
	Random generator = new Random();

   System.out.println("Welcome to the Rock, Paper, Scissors game!");


	//Generate computer's play (0,1,2) 
   computerInt = generator.nextInt(4);



   //Translate computer's randomly generated play to string using if //statements
	if (computerInt == 0)
      computerPlay = "R";
   else 
   {     
         if (computerInt == 1)
            computerPlay = "P";
         else               
            computerPlay = "S";
   }                              

   
   //Get player's play from input-- note that this is stored as a string
   System.out.println("Please enter either R, S, or P for your action");
   personPlay = scan.nextLine();
   
   
	//Make player's play uppercase for ease of comparison
   personPlay = personPlay.toUpperCase();


	//Print computer's play
   System.out.println ("You have played: " + personPlay);
   System.out.println ("The computer has played: " +computerPlay);


	//See who won.  Use nested ifs 
	if (personPlay.equals(computerPlay))  
	    System.out.println("It's a tie!");
	   else if (personPlay.equals("R"))
      {
	      if (computerPlay.equals("S"))
		   System.out.println("Rock crushes scissors.  You win!!");
	      else           
              System.out.println("Paper beats rock. Computer Wins!!");
      }
      else if (personPlay.equals("S"))
      {
          if (computerPlay.equals("R"))
             System.out.println("Rock crushes scissors. Computer Wins!!");
          else 
              System.out.println("Paper beats rock. You Win!!");
       
      }
      else if (personPlay.equals("P"))
      {
           if (computerPlay.equals("R"))
              System.out.println("Paper beats rock. You Win!!");
           else 
               System.out.println("Scissors cut paper. Computer Wins!!");
      }
                                    
		//...  Fill in rest of code
    }
}
