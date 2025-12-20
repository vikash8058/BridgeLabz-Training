//program to check whether a year is leap year or not
import java.util.Scanner;

public class LeapYearCheck
{
	//method to check leap year
	public static boolean isLeapYear(int year)
	{
		//check for Gregorian calendar year
		if(year>=1582)
		{
			//apply leap year conditions
			if((year%4==0 && year%100!=0) || year%400==0)
			{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input value
		System.out.print("Enter year: ");
		int year=input.nextInt();

		//call method and display result
		if(isLeapYear(year))
		{
			System.out.println("Year is a Leap Year");
		}
		else
		{
			System.out.println("Year is not a Leap Year");
		}

		input.close(); //closing input stream
	}
}
