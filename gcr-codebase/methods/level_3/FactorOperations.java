//program to perform operations using factors of a number
import java.util.Scanner;

public class FactorOperations
{
	//method to find factors
	public static int[] findFactors(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0) count++;
		}

		int factors[]=new int[count];
		int index=0;

		for(int i=1;i<=number;i++)
		{
			if(number%i==0) factors[index++]=i;
		}
		return factors;
	}

	//method to find greatest factor
	public static int greatestFactor(int factors[])
	{
		return factors[factors.length-2];
	}

	//method to find sum of factors
	public static int sumOfFactors(int factors[])
	{
		int sum=0;
		for(int f:factors) sum+=f;
		return sum;
	}

	//method to find product of factors
	public static int productOfFactors(int factors[])
	{
		int product=1;
		for(int f:factors) product*=f;
		return product;
	}

	//method to find product of cube of factors
	public static double productOfCubeOfFactors(int factors[])
	{
		double product=1;
		for(int f:factors)
		{
			product*=Math.pow(f,3);
		}
		return product;
	}

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number=input.nextInt();

		int factors[]=findFactors(number);

		System.out.print("Factors: ");
		for(int f:factors)
		{
			System.out.print(f+" ");
		}

		System.out.println("\nGreatest Factor: "+greatestFactor(factors));
		System.out.println("Sum of Factors: "+sumOfFactors(factors));
		System.out.println("Product of Factors: "+productOfFactors(factors));
		System.out.println("Product of Cube of Factors: "+productOfCubeOfFactors(factors));

		input.close();
	}
}
