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
	
	//method to display elements of array
	void display(int angle[]){
		System.out.println("Sine: "+angle[0]);
		System.out.println("Cosine: "+angle[1]);
		System.out.println("Tangent: "+angle[2]);
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

		//calling method
		double result[]=trig.calculateTrigonometricFunctions(angle);

		//callign method for display result
		trig.display(angle);
		
		input.close();  //closing input stream
	}
}
