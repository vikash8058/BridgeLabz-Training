//program to calculate area of triangle
import java.util.Scanner;
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
	//creating variables to store base and height
	double base, height;

	//Creating Scanner object to take input from user
	Scanner input=new Scanner(System.in);

	//taking input for base and height
	System.out.print("Enter base in cm: ");
	base=input.nextDouble();
	System.out.print("Enter height in cm: ");
	height=input.nextDouble();
	
	//calculating area of triangle
	double areaSqCm=0.5*base*height;
	double areaSqIn=areaSqCm/(2.54*2.54);

	//displaying result
	System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);

	input.close();  // Closing the Scanner object
    }

}