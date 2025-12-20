//program to find the sum of n natural numbers using method
import java.util.Scanner;

public class SumOfNaturalNumbers
{
	//method to calculate sum of n natural numbers
	int findSum(int number)
	{
		int sum=0;

		for(int i=1;i<=number;i++)
		{
			sum=sum+i;
		}

		return sum;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//creating object of the class
		SumOfNaturalNumbers sumObj=new SumOfNaturalNumbers();

		//get input value
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//calling method to find sum
		int result=sumObj.findSum(number);

		//display result
		System.out.println("Sum of natural numbers: "+result);

		input.close();  //closing input stream
	}
}
