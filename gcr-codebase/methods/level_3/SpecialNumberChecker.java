//program to check special numbers
import java.util.Scanner;

public class SpecialNumberChecker
{
	//method to check palindrome
	public static boolean isPalindrome(int digits[])
	{
		int start=0,end=digits.length-1;
		while(start<end)
		{
			if(digits[start++]!=digits[end--])
			{
				return false;
			}
		}
		return true;
	}

	//method to check prime number
	public static boolean isPrime(int number)
	{
		if(number<=1) return false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0) return false;
		}
		return true;
	}

	//method to check neon number
	public static boolean isNeon(int number)
	{
		int square=number*number;
		int sum=0;

		while(square!=0)
		{
			sum+=square%10;
			square/=10;
		}
		return sum==number;
	}

	//method to check spy number
	public static boolean isSpy(int number)
	{
		int sum=0,product=1;

		while(number!=0)
		{
			int d=number%10;
			sum+=d;
			product*=d;
			number/=10;
		}
		return sum==product;
	}

	//method to check buzz number
	public static boolean isBuzz(int number)
	{
		return number%7==0 || number%10==7;
	}

	//method to check automorphic number
	public static boolean isAutomorphic(int number)
	{
		int square=number*number;
		return String.valueOf(square).endsWith(String.valueOf(number));
	}

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number=input.nextInt();

		int digits[]=NumberChecker.storeDigits(number);

		System.out.println("Palindrome: "+isPalindrome(digits));
		System.out.println("Prime: "+isPrime(number));
		System.out.println("Neon: "+isNeon(number));
		System.out.println("Spy: "+isSpy(number));
		System.out.println("Buzz: "+isBuzz(number));
		System.out.println("Automorphic: "+isAutomorphic(number));

		input.close();
	}
}
