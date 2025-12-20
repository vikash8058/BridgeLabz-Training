//program to perform various number checks using digits array
import java.util.Scanner;

public class NumberChecker
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

	//method to check armstrong number
	public static boolean isArmstrongNumber(int number,int digits[])
	{
		int sum=0;
		int power=digits.length;

		for(int i=0;i<digits.length;i++)
		{
			sum=sum+(int)Math.pow(digits[i],power);
		}

		return sum==number;
	}

	//method to find largest and second largest digit
	public static int[] findLargestAndSecondLargest(int digits[])
	{
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;

		for(int i=0;i<digits.length;i++)
		{
			if(digits[i]>largest)
			{
				secondLargest=largest;
				largest=digits[i];
			}
			else if(digits[i]>secondLargest && digits[i]!=largest)
			{
				secondLargest=digits[i];
			}
		}

		return new int[]{largest,secondLargest};
	}

	//method to find smallest and second smallest digit
	public static int[] findSmallestAndSecondSmallest(int digits[])
	{
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;

		for(int i=0;i<digits.length;i++)
		{
			if(digits[i]<smallest)
			{
				secondSmallest=smallest;
				smallest=digits[i];
			}
			else if(digits[i]<secondSmallest && digits[i]!=smallest)
			{
				secondSmallest=digits[i];
			}
		}

		return new int[]{smallest,secondSmallest};
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

		//check and display duck number
		System.out.println("Duck Number: "+isDuckNumber(digits));

		//check and display armstrong number
		System.out.println("Armstrong Number: "+isArmstrongNumber(number,digits));

		//find largest and second largest
		int large[]=findLargestAndSecondLargest(digits);
		System.out.println("Largest Digit: "+large[0]);
		System.out.println("Second Largest Digit: "+large[1]);

		//find smallest and second smallest
		int small[]=findSmallestAndSecondSmallest(digits);
		System.out.println("Smallest Digit: "+small[0]);
		System.out.println("Second Smallest Digit: "+small[1]);

		input.close(); //closing input stream
	}
}
