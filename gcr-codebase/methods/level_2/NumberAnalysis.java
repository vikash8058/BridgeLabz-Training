//program to check positive/negative, even/odd and compare values
import java.util.Scanner;

public class NumberAnalysis
{
	//method to check positive or negative
	public static boolean isPositive(int number)
	{
		return number>=0;
	}

	//method to check even or odd
	public static boolean isEven(int number)
	{
		return number%2==0;
	}

	//method to compare two numbers
	public static int compare(int number1,int number2)
	{
		if(number1>number2)
		{
			return 1;
		}
		else if(number1==number2)
		{
			return 0;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		int numbers[]=new int[5];

		//take input values
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print("Enter number "+(i+1)+": ");
			numbers[i]=input.nextInt();

			if(isPositive(numbers[i]))
			{
				if(isEven(numbers[i]))
				{
					System.out.println("Positive Even");
				}
				else
				{
					System.out.println("Positive Odd");
				}
			}
			else
			{
				System.out.println("Negative Number");
			}
		}

		//compare first and last elements
		int result=compare(numbers[0],numbers[numbers.length-1]);

		if(result==1)
		{
			System.out.println("First element is greater than last");
		}
		else if(result==0)
		{
			System.out.println("First and last elements are equal");
		}
		else
		{
			System.out.println("First element is less than last");
		}

		input.close(); //closing input stream
	}
}
