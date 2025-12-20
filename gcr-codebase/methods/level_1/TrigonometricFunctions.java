//program to calculate trigonometric functions using Math class
import java.util.Scanner;

public class TrigonometricFunctions
{
	//method to calculate sine, cosine and tangent
	public double[] calculateTrigonometricFunctions(double angle)
	{
		double radians=Math.toRadians(angle);

		double result[]=new double[3];
		result[0]=Math.sin(radians);   //sine
		result[1]=Math.cos(radians);   //cosine
		result[2]=Math.tan(radians);   //tangent

		return result;
	}
	
	//method to display trigonometric values
	void display(double values[])
	{
		System.out.println("Sine: "+values[0]);
		System.out.println("Cosine: "+values[1]);
		System.out.println("Tangent: "+values[2]);
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//creating object of the class
		TrigonometricFunctions trig=new TrigonometricFunctions();

		//get input value
		System.out.print("Enter angle in degrees: ");
		double angle=input.nextDouble();

		//calling method to calculate values
		double result[]=trig.calculateTrigonometricFunctions(angle);

		//calling method to display result
		trig.display(result);
		
		input.close();  //closing input stream
	}
}
