// ***************************************************************
//  Matthew Coplan 
//	StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
	String phrase;
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String switchedPhrase; // a new phrase with original halves switched
   String middle3; // middle three characters of the string
   int middle2;
   int middle1;
   String city; // City they enter
   String state; // State they enter
   String stateCaps;
   String cityNocaps;
   String stateAgain;

	//read in a phrase
Scanner scan = new Scanner(System.in);
System.out.println("Please enter a phrase:");
	phrase = scan.nextLine();
   
System.out.println ("Please enter the state you live in:");
   state = scan.nextLine();
   
System.out.println ("Please enter the city you live in:");
   city = scan.nextLine();
	

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get the substring for each half of the phrase
	firstHalf = phrase.substring (0 , middleIndex);
   secondHalf = phrase.substring (middleIndex, phraseLength);


	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat (firstHalf);
   
   // get the middle three characters in the string
   middle2 = middleIndex + 2;
   middle1 = middleIndex - 1;
   middle3 = phrase.substring (middle1, middle2);
   
   // replace all blank with *
   switchedPhrase = phrase.replace (' ', '*');
   
   //State and City
   stateCaps = state.toUpperCase();
   cityNocaps = city.toLowerCase();
   stateAgain = stateCaps.concat(cityNocaps);
   
   
	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +
			    " characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " + 
			    phrase.charAt(middleIndex));
   System.out.println ("First half of the string: " + firstHalf);
   System.out.println ("Second half of the string: " + secondHalf);
   System.out.println ("Switched phrases: " + switchedPhrase);
   System.out.println ("Three middle characters: " + middle3);
   System.out.println ("State Caps: " + stateCaps);
   System.out.println ("City No Caps: " +cityNocaps);
   System.out.println ("Concatenated String: " + stateAgain + stateCaps);
   
	

	System.out.println();
    }
}
