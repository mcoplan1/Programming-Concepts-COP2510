//************************************************************
//	Matthew Coplan	
//	Count.java
//
//	This program counts the number of characters in a string
//************************************************************
import java.util.Scanner;

public class Count
{
  public static void main (String[] args)
  {
      String phrase=" ";    // a string of characters
      int countBlank, countA, countE, countS, countT;   // the number of blanks (spaces) in the phrase 
      int length;       // the length of the phrase
      char ch;          // an individual character in the string

	Scanner scan = new Scanner(System.in);

      // Print a program header
      System.out.println ();
      System.out.println ("Character Counter");
      System.out.println ();
      // while loop
      
      while (!phrase.equals("quit")){
      
         // Read in a string and find its length
         System.out.println ("Enter a sentence or phrase: (or type quit to exit)");
         phrase = scan.nextLine();
         length = phrase.length();
  
         // Initialize counts
         countBlank = 0;
         countA = 0;
         countE = 0;
         countS = 0;
         countT = 0;

            // a for loop to go through the string character by character
            // and count the blank space

            for (int i = 0; i < phrase.length();i++)
		      {
               ch = phrase.charAt(i);
				
                  switch (ch)
                 {
                  case 'a':
                  case 'A': countA++;
	                        break;
                  case 'e':
                  case 'E': countE++;
                           break;
                  case 's':
                  case 'S': countS++;
                           break;
                  case 't':
                  case 'T': countT++;
                            break;
                  case ' ': countBlank++;
      
                  } 
             }
        
               // Print the results
            
                
                System.out.println ();
                System.out.println ("Number of blank spaces: " + countBlank);
                System.out.println ("Number of letter a's: " + countA);
                System.out.println ("Number of letter e's: " + countE);
                System.out.println ("Number of letter s's: " + countS);
                System.out.println ("Number of letter t's: " + countT);
                            
       }

      
  }
}
