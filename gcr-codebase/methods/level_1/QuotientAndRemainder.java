//program to find quotient and remainder using method
import java.util.Scanner;

public class QuotientAndRemainder
{
	//method to find remainder and quotient
	public static int[] findRemainderAndQuotient(int number,int divisor)
	{
		int result[]=new int[2];

		result[0]=number/divisor;   //quotient
		result[1]=number%divisor;   //remainder

		return result;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input values
		System.out.print("Enter number: ");
		int number=input.nextInt();

		System.out.print("Enter divisor: ");
		int divisor=input.nextInt();

		//calling method
		int result[]=findRemainderAndQuotient(number,divisor);

		//display result
		System.out.println("Quotient: "+result[0]);
		System.out.println("Remainder: "+result[1]);

		input.close();  //closing input stream
	}
}
