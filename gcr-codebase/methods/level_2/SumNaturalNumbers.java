//program to find sum of n natural numbers using recursion and formula
import java.util.Scanner;

public class SumNaturalNumbers
{
	//method to find sum using recursion
	public static int recursiveSum(int number)
	{
		if(number==0)
		{
			return 0;
		}

		return number+recursiveSum(number-1);
	}

	//method to find sum using formula
	public static int formulaSum(int number)
	{
		return number*(number+1)/2;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input value
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//call both methods
		int sumByRecursion=recursiveSum(number);
		int sumByFormula=formulaSum(number);

		//display results
		System.out.println("Sum using recursion: "+sumByRecursion);
		System.out.println("Sum using formula: "+sumByFormula);

		//compare results
		if(sumByRecursion==sumByFormula)
		{
			System.out.println("Both results are correct");
		}

		input.close(); //closing input stream
	}
}
