//program to perform reverse, compare, palindrome and duck number checks
import java.util.Scanner;

public class NumberCheckerReverse
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

	//method to reverse the digits array
	public static int[] reverseDigits(int digits[])
	{
		int reversed[]=new int[digits.length];
		int index=0;

		for(int i=digits.length-1;i>=0;i--)
		{
			reversed[index]=digits[i];
			index++;
		}

		return reversed;
	}

	//method to compare two arrays
	public static boolean compareArrays(int first[],int second[])
	{
		if(first.length!=second.length)
		{
			return false;
		}

		for(int i=0;i<first.length;i++)
		{
			if(first[i]!=second[i])
			{
				return false;
			}
		}

		return true;
	}

	//method to check palindrome number using digits
	public static boolean isPalindrome(int digits[])
	{
		int reversed[]=reverseDigits(digits);
		return compareArrays(digits,reversed);
	}

	//method to check duck number
	//a duck number contains at least one zero digit
	public static boolean isDuckNumber(int digits[])
	{
		for(int i=0;i<digits.length;i++)
		{
			if(digits[i]==0)
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
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//store digits in array
		int digits[]=storeDigits(number);

		//reverse digits
		int reversed[]=reverseDigits(digits);

		//display reversed digits
		System.out.print("Reversed Digits: ");
		for(int i=0;i<reversed.length;i++)
		{
			System.out.print(reversed[i]+" ");
		}
		System.out.println();

		//compare original and reversed digits
		System.out.println("Palindrome Number: "+isPalindrome(digits));

		//check duck number
		System.out.println("Duck Number: "+isDuckNumber(digits));

		input.close(); //closing input stream
	}
}
