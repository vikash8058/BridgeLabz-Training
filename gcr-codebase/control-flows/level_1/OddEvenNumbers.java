//program to print odd and even numbers
import java.util.Scanner;

public class OddEvenNumbers
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter the number: ");
	int number=input.nextInt();

	if(number>0)
	{
	    for(int i=1;i<=number;i++)
	    {
		if(i%2==0)
		{
		    System.out.println(i+" is even");
		}
		else
		{
		    System.out.println(i+" is odd");
		}
	    }
	}
	else
	{
	    System.out.println("Please enter a natural number");
	}

	input.close();  //closing input stream
    }
}
