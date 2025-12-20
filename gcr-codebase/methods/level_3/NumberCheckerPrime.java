//program to check perfect, abundant, deficient and strong number
import java.util.Scanner;

public class NumberCheckerPrime
{
	//method to find sum of proper divisors of a number
	public static int sumOfProperDivisors(int number)
	{
		int sum=0;

		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}

		return sum;
	}

	//method to check perfect number
	public static boolean isPerfectNumber(int number)
	{
		if(number<=0)
		{
			return false;
		}

		return sumOfProperDivisors(number)==number;
	}

	//method to check abundant number
	public static boolean isAbundantNumber(int number)
	{
		if(number<=0)
		{
			return false;
		}

		return sumOfProperDivisors(number)>number;
	}

	//method to check deficient number
	public static boolean isDeficientNumber(int number)
	{
		if(number<=0)
		{
			return false;
		}

		return sumOfProperDivisors(number)<number;
	}

	//method to find factorial of a digit
	public static int factorial(int digit)
	{
		int fact=1;

		for(int i=1;i<=digit;i++)
		{
			fact=fact*i;
		}

		return fact;
	}

	//method to check strong number
	public static boolean isStrongNumber(int number)
	{
		int temp=number;
		int sum=0;

		while(temp!=0)
		{
			int digit=temp%10;
			sum=sum+factorial(digit);
			temp=temp/10;
		}

		return sum==number;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input value
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//check and display results
		System.out.println("Perfect Number: "+isPerfectNumber(number));
		System.out.println("Abundant Number: "+isAbundantNumber(number));
		System.out.println("Deficient Number: "+isDeficientNumber(number));
		System.out.println("Strong Number: "+isStrongNumber(number));

		input.close(); //closing input stream
	}
}
