//**********************************************************
//  Matthew Coplan
//	Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************

public class Circle
{
    public static void main(String[] args)
    {
     final double PI = 3.14159;
     
     int radius1 = 10;
     int radius2 = 20;
     double area1 = PI * radius1 * radius1;
     double area2 = PI * radius2 * radius2;
     double circumference1 = (2*PI) * radius1;
     double circumference2 = (2*PI) * radius2;
     double differencearea = area2 / area1;
     double differencecircum = circumference2 / circumference1;

     System.out.println("The area of a circle with radius " + radius1 +
                        " is " + area1);
     
     area1 = PI * radius1 * radius1; //area one
     
     System.out.println("The area of a circle with radius " + radius2 +
                        " is " + area2);

     area2 = PI * radius2 * radius2; //area  two
     
     System.out.println("The circumference of a circle with radius " + radius1 + 
                        " is " + circumference1);
     
     circumference1 = (2 * PI) * radius1;
     
     System.out.println("The circumference of a circle with radius " + radius2 +
                        " is " + circumference2);
                     
     circumference2 = (2 * PI) * radius2;
     
     System.out.println("The difference in the two areas is: " + differencearea);
     
     differencearea = area2 / area1;
     
     System.out.println("The difference in the two circumferences is: " + differencecircum);
     
     differencecircum = circumference2 / circumference1;
     
                        

    }
}
