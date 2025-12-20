//program to find smallest and largest of three numbers using method
import java.util.Scanner;

public class SmallestAndLargest
{
	//method to find smallest and largest number
	public static int[] findSmallestAndLargest(int number1,int number2,int number3)
	{
		int smallest=number1;
		int largest=number1;

		if(number2<smallest)
		{
			smallest=number2;
		}
		if(number3<smallest)
		{
			smallest=number3;
		}

		if(number2>largest)
		{
			largest=number2;
		}
		if(number3>largest)
		{
			largest=number3;
		}

		int result[]=new int[2];
		result[0]=smallest;
		result[1]=largest;

		return result;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//get input values
		System.out.print("Enter first number: ");
		int number1=input.nextInt();

		System.out.print("Enter second number: ");
		int number2=input.nextInt();

		System.out.print("Enter third number: ");
		int number3=input.nextInt();

		//calling method
		int result[]=findSmallestAndLargest(number1,number2,number3);

		//display result
		System.out.println("Smallest number: "+result[0]);
		System.out.println("Largest number: "+result[1]);

		input.close();  //closing input stream
	}
}
