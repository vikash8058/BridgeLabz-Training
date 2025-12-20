//program to divide chocolates among children
import java.util.Scanner;

public class ChocolatesDistribution
{
	//method to find chocolates per child and remaining chocolates
	public static int[] findRemainderAndQuotient(int number,int divisor)
	{
		int result[]=new int[2];

		result[0]=number/divisor;   //chocolates per child
		result[1]=number%divisor;   //remaining chocolates

		return result;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input values
		System.out.print("Enter number of chocolates: ");
		int chocolates=input.nextInt();

		System.out.print("Enter number of children: ");
		int children=input.nextInt();

		//calling method
		int result[]=findRemainderAndQuotient(chocolates,children);

		//display result
		System.out.println("Chocolates per child: "+result[0]);
		System.out.println("Remaining chocolates: "+result[1]);

		input.close();  //closing input stream
	}
}
