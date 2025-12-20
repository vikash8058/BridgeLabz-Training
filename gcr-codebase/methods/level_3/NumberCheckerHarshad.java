//program to perform digit based operations on a number
import java.util.Scanner;

public class NumberCheckerHarshad
{
	//method to find count of digits in a number
	public static int countDigits(int number)
	{
		int count=0;

		while(number!=0)
		{
			count++;
			number=number/10;
		}

		return count;
	}

	//method to store digits of the number in an array
	public static int[] storeDigits(int number)
	{
		int size=countDigits(number);
		int digits[]=new int[size];
		int index=0;

		while(number!=0)
		{
			digits[index]=number%10;
			number=number/10;
			index++;
		}

		return digits;
	}

	//method to find sum of digits using digits array
	public static int sumOfDigits(int digits[])
	{
		int sum=0;

		for(int i=0;i<digits.length;i++)
		{
			sum=sum+digits[i];
		}

		return sum;
	}

	//method to find sum of squares of digits
	public static double sumOfSquaresOfDigits(int digits[])
	{
		double sum=0;

		for(int i=0;i<digits.length;i++)
		{
			sum=sum+Math.pow(digits[i],2);
		}

		return sum;
	}

	//method to check harshad number
	public static boolean isHarshadNumber(int number,int digits[])
	{
		int sum=sumOfDigits(digits);

		if(sum==0)
		{
			return false;
		}

		return number%sum==0;
	}

	//method to find frequency of each digit
	public static int[][] findDigitFrequency(int digits[])
	{
		int frequency[][]=new int[10][2];

		//initialize first column with digits 0 to 9
		for(int i=0;i<10;i++)
		{
			frequency[i][0]=i;
		}

		//count frequency of digits
		for(int i=0;i<digits.length;i++)
		{
			frequency[digits[i]][1]++;
		}

		return frequency;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input value
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//store digits in array
		int digits[]=storeDigits(number);

		//display sum of digits
		System.out.println("Sum of digits: "+sumOfDigits(digits));

		//display sum of squares of digits
		System.out.println("Sum of squares of digits: "+sumOfSquaresOfDigits(digits));

		//check and display harshad number
		System.out.println("Harshad Number: "+isHarshadNumber(number,digits));

		//find digit frequency
		int frequency[][]=findDigitFrequency(digits);

		//display digit frequency
		System.out.println("Digit Frequency:");
		for(int i=0;i<10;i++)
		{
			if(frequency[i][1]>0)
			{
				System.out.println(frequency[i][0]+" -> "+frequency[i][1]);
			}
		}

		input.close(); //closing input stream
	}
}
