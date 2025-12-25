//program to calculate BMI and display BMI category
import java.util.Scanner;

public class BMIFitnessTracker {

	public static void main(String[] args) {
		
		//create Scanner object
		Scanner input =new Scanner(System.in);
		
		//get height and weight in meters
		System.out.print("Enter height in meters: ");
		double height=input.nextDouble();
		System.out.print("Enter weight in kilograms: ");
		double weight=input.nextDouble();
		
		//calculate BMI
		double bmi=weight/(height*height);
		
		//display BMI value
		System.out.println("BMI value: "+bmi);
		
		//check BMI category
		if(bmi<18.5) {
			System.out.println("BMI category: Underweight");
		}
		else if(bmi>=18.5 && bmi<25) {
			System.out.println("BMI category: Normal");
		}
		else {
			System.out.println("BMI category: Overweight");
		}
		
		input.close(); // closing input stream
	}
	
}
