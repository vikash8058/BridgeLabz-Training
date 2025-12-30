/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.

*/

import java.util.Scanner;

public class TemperatureLogger{
	
	//method to find the maximum temperature
	public static double findMaxTemperature(double[] temperature){
		double maxTemperature=temperature[0];
		for(int i=1;i<7;i++){
			if(maxTemperature<temperature[i]){
				maxTemperature=temperature[i];
			}
		}	
		return maxTemperature;
	}
	
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//create an array that store the temperature of 7 days
		double temperature[]=new double[7];
		double sum=0;
		
		System.out.println("Please...enter the temperature in degree celcius");
		//get the temperature from user and store it into temperature array
		for(int i=0;i<7;i++){
			System.out.print("Enter the temperature of "+(i+1)+" day: ");
			temperature[i]=input.nextDouble();
			sum+=temperature[i];   //add the temperature into sum for displaying average temperature
		}
		System.out.println();
		
		//calling the method to find the maximum temperature
		double maxTemperature=findMaxTemperature(temperature);
		
		double averageTemperature=sum/7;  //get the average temperature
		
		//displaying the result
		System.out.println("Average temperature among 7 days is : "+averageTemperature);
		System.out.println("Maximum temperature among 7 days is: "+maxTemperature);
		
		input.close(); //closing the input stream
	}
}