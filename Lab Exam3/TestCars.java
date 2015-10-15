//*********************************************************************
//  Matthew Coplan
//	TestCars.java
//
//*********************************************************************

import java.util.Scanner;

public class TestCars
{
    //-------------------------------------------------------
// Creates a car object and then calls the accelerate method and  
// the brake method.
    //-------------------------------------------------------
    public static void main (String[] args)
    {
	   String makeOfCar;
	   String modelOfCar;
	   int yearOfCar;
      int maxSpeed;
   
	   //SportsCar car1;


	   Scanner scan = new Scanner(System.in);

	   System.out.println ("Testing Cars Program\n");

	   System.out.print ("Enter the make of the car: ");
	   makeOfCar = scan.nextLine();
	   System.out.print ("Enter the model of the car: ");
	   modelOfCar = scan.nextLine();

      System.out.print ("Enter the year of the car: ");
   	yearOfCar = scan.nextInt();

      System.out.print ("Enter the maximum speed of the car: ");
     	maxSpeed = scan.nextInt();



	   // Create a SportsCar object car1 with user input. 
      SportsCar car1 = new SportsCar(makeOfCar, modelOfCar, yearOfCar, maxSpeed);
	 
	
      // Accelerate seven times and display the current speed after 
      // each call.
      
	
	   // add your code here
       car1.accelerate(); //1
       car1.accelerate(); //2
       car1.accelerate(); //3
       car1.accelerate(); //4
       car1.accelerate(); //5
       car1.accelerate(); //6
       car1.accelerate(); //7
	  
      // Brake eight times and display the current speed after 
      // each call.


	   // add your code here
        car1.brake(); //1
        car1.brake(); //2
        car1.brake(); //3
        car1.brake(); //4
        car1.brake(); //5
        car1.brake(); //6
        car1.brake(); //7
        car1.brake(); //8

	   // Print summary for the car 
	   System.out.println();
	   System.out.println (car1);
     }
}
