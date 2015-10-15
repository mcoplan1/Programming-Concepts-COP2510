//*********************************************************************
//  Matthew Coplan
//	SportsCar.java
//
//  Represents a sportscar.
//*********************************************************************

public class SportsCar{

    // Instance variables
    private String make;
    private String model;
    private int year;

    //add your code here.
    int currentSpeed = 0;
    int speed;

	
//------------------------------------------------------------------
// A constructor that has four parameters-a String containing the
// make of the car, a String containing the model of the car, a int 
// containing the year of the car, a int containing the maximum 
//speed of the car. The constructor should initialize make, model, // year, and maximum speed. The constructor should set speed to 0.
//------------------------------------------------------------------


   //add your code here.
   public SportsCar(String makeOfCar, String modelOfCar, int yearOfCar, int maxSpeed)
   {
      make = makeOfCar;
      model = modelOfCar;
      year = yearOfCar;
      speed = maxSpeed;
   }

    //----------------------------------------------------------------
   // Method accelerate that takes no parameter. The method updates the 
   // speed by adding 15 to the speed if the speed will not exceed the
   // maximum speed. The method should return the current speed. 
   //----------------------------------------------------------------
    
   
    //add your code here.
   public int accelerate ()
   {
    System.out.println("Accelerate!");
    if (currentSpeed < speed)
    {
     currentSpeed = currentSpeed + 15;
     }
    System.out.println("Current speed is :" +currentSpeed);
    return currentSpeed;
   }
   


    //----------------------------------------------------------------
   // Method brake that takes no parameter. The method updates the 
   // speed by subtracting 15 to the speed if the speed will not be
    //negative. The method should return the current speed.
   //----------------------------------------------------------------
    
	// add your code here.
   public int brake ()
   {
    System.out.println("Brake!");
    if (currentSpeed > 0)
    {
      currentSpeed = currentSpeed - 15;
      }
    System.out.println("Current speed is :" +currentSpeed);
    return currentSpeed;
   }
   


    //----------------------------------------------------------------
    //toString() method returns a string representation of a sportscar.
    //----------------------------------------------------------------
	// add your code here.
    public String toString ()
   {
   	return ("Make: " +make+","+" Model: "+model+","+" Year: "+year+","+" Maximum speed: "+speed);
   }

} 
