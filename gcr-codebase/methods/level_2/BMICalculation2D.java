//program to calculate BMI of 10 persons and display their status
import java.util.Scanner;

public class BMICalculation2D
{
	//method to calculate BMI and store in array
	public static void calculateBMI(double data[][])
	{
		for(int i=0;i<data.length;i++)
		{
			//convert height from cm to meter
			double heightInMeter=data[i][1]/100;

			//calculate BMI
			data[i][2]=data[i][0]/(heightInMeter*heightInMeter);
		}
	}

	//method to determine BMI status
	public static String[] determineStatus(double data[][])
	{
		String status[]=new String[data.length];

		for(int i=0;i<data.length;i++)
		{
			if(data[i][2]<18.5)
			{
				status[i]="Underweight";
			}
			else if(data[i][2]>=18.5 && data[i][2]<=24.9)
			{
				status[i]="Normal";
			}
			else if(data[i][2]>=25.0 && data[i][2]<=39.9)
			{
				status[i]="Overweight";
			}
			else
			{
				status[i]="Obese";
			}
		}

		return status;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//create 2-D array for 10 persons
		//column 0 -> weight, 1 -> height, 2 -> BMI
		double personData[][]=new double[10][3];

		//take input for weight and height
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter details of person "+(i+1));

			System.out.print("Enter weight in kg: ");
			personData[i][0]=input.nextDouble();

			System.out.print("Enter height in cm: ");
			personData[i][1]=input.nextDouble();
		}

		//calculate BMI
		calculateBMI(personData);

		//get BMI status
		String status[]=determineStatus(personData);

		//display result
		System.out.println("\nBMI Details:");
		for(int i=0;i<10;i++)
		{
			System.out.println("Person "+(i+1));
			System.out.println("Weight: "+personData[i][0]+" kg");
			System.out.println("Height: "+personData[i][1]+" cm");
			System.out.println("BMI: "+personData[i][2]);
			System.out.println("Status: "+status[i]);
			System.out.println();
		}

		input.close(); //closing input stream
	}
}
