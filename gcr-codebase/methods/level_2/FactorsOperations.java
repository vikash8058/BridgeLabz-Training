//program to find factors of a number and perform operations on them
import java.util.Scanner;

public class FactorsOperations
{
	//method to find factors of a number and return them in an array
	public static int[] findFactors(int number)
	{
		int count=0;

		//first loop to count number of factors
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}

		//create array with exact size
		int factors[]=new int[count];
		int index=0;

		//second loop to store factors in array
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				factors[index]=i;
				index++;
			}
		}

		return factors;
	}

	//method to find sum of factors
	public static int findSum(int factors[])
	{
		int sum=0;

		for(int i=0;i<factors.length;i++)
		{
			sum=sum+factors[i];
		}

		return sum;
	}

	//method to find product of factors
	public static int findProduct(int factors[])
	{
		int product=1;

		for(int i=0;i<factors.length;i++)
		{
			product=product*factors[i];
		}

		return product;
	}

	//method to find sum of square of factors
	public static double findSumOfSquares(int factors[])
	{
		double sum=0;

		for(int i=0;i<factors.length;i++)
		{
			sum=sum+Math.pow(factors[i],2);
		}

		return sum;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input value
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//call method to find factors
		int factors[]=findFactors(number);

		//display factors
		System.out.print("Factors are: ");
		for(int i=0;i<factors.length;i++)
		{
			System.out.print(factors[i]+" ");
		}

		//display calculated results
		System.out.println("\nSum of factors: "+findSum(factors));
		System.out.println("Product of factors: "+findProduct(factors));
		System.out.println("Sum of square of factors: "+findSumOfSquares(factors));

		input.close(); //closing input stream
	}
}
