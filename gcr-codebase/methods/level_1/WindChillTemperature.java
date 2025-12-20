//program to calculate wind chill temperature using method
import java.util.Scanner;

public class WindChillTemperature
{
	//method to calculate wind chill
	public double calculateWindChill(double temperature,double windSpeed)
	{
		double windChill;

		windChill=35.74 + 0.6215*temperature +
		          (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);

		return windChill;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//creating object of the class
		WindChillTemperature wc=new WindChillTemperature();

		//get input values
		System.out.print("Enter temperature: ");
		double temperature=input.nextDouble();

		System.out.print("Enter wind speed: ");
		double windSpeed=input.nextDouble();

		//calling method
		double result=wc.calculateWindChill(temperature,windSpeed);

		//display result
		System.out.println("Wind Chill Temperature: "+result);

		input.close();  //closing input stream
	}
}
