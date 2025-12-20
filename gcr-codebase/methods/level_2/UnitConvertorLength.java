//program to perform length unit conversions using static methods
import java.util.Scanner;

public class UnitConvertorLength
{
	//method to convert yards to feet
	public static double convertYardsToFeet(double yards)	
	{
		double yards2feet=3;
		return yards*yards2feet;
	}

	//method to convert feet to yards
	public static double convertFeetToYards(double feet)
	{
		double feet2yards=0.333333;
		return feet*feet2yards;
	}

	//method to convert meters to inches
	public static double convertMetersToInches(double meters)
	{
		double meters2inches=39.3701;
		return meters*meters2inches;
	}

	//method to convert inches to meters
	public static double convertInchesToMeters(double inches)
	{
		double inches2meters=0.0254;
		return inches*inches2meters;
	}

	//method to convert inches to centimeters
	public static double convertInchesToCentimeters(double inches)
	{
		double inches2cm=2.54;
		return inches*inches2cm;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input for yards to feet
		System.out.print("Enter yards: ");
		double yards=input.nextDouble();
		System.out.println("Feet: "+convertYardsToFeet(yards));

		//get input for feet to yards
		System.out.print("Enter feet: ");
		double feet=input.nextDouble();
		System.out.println("Yards: "+convertFeetToYards(feet));

		//get input for meters to inches
		System.out.print("Enter meters: ");
		double meters=input.nextDouble();
		System.out.println("Inches: "+convertMetersToInches(meters));

		//get input for inches to meters
		System.out.print("Enter inches: ");
		double inches=input.nextDouble();
		System.out.println("Meters: "+convertInchesToMeters(inches));

		//get input for inches to centimeters
		System.out.print("Enter inches (for cm): ");
		double inch=input.nextDouble();
		System.out.println("Centimeters: "+convertInchesToCentimeters(inch));

		input.close(); //closing input stream
	}
}
