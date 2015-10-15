// ****************************************************************
//  Matthew Coplan
//	GradingQuizzes.java
//
//	Grades quizzes based on an answer key
// ****************************************************************

import java.util.Scanner;

public class GradedQuizzes
{
   public static void main(String[] args)
   {
   int numOfQuestions; //number of questions
   int answer; //quiz answers
   double percentCorrect;
   String value = "y";
   
   //Grab number of questions from user
   Scanner scan = new Scanner(System.in);
   
   // do-while loop to enter more tests if they enter y
   do {
   
         System.out.println("Enter the amount of questions on the test");
         numOfQuestions = scan.nextInt();
   
         int[] key = new int[numOfQuestions];
 
         //loop for answer key
         for (int i=0; i<numOfQuestions; i++)
               {
               System.out.println("Enter the key to question: " +i);
               key[i] = scan.nextInt();
               }
   
         //Initalize count
         int count = 0;
         
         //loop to compare test to answer key
         for (int i=0; i<numOfQuestions; i++)
                {
                System.out.println("Enter the answer to question: " +i);
                answer = scan.nextInt();
                if (answer == key[i])
                count++;
                }
     
         //Calculate number of questions correct
         
         System.out.println("Number of questions correct: " +count);
     
         percentCorrect = ((double)count/numOfQuestions)*100;
         System.out.println("Percent correct: " +percentCorrect+ "%");
         
         //Grab input from user to continue loop
         System.out.println("Grade another quiz (y/n)");
         value = scan.next();
     
      } while (value.equals("y"));
   }
}