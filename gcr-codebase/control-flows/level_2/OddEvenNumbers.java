//program to print odd and even numbers
import java.util.Scanner;

public class OddEvenNumbers
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	//iterate from 1 to number and displaying the result
	for(int i=1;i<=number;i++)
	{
	    if(i%2==0)
	    {
		System.out.println(i+" is Even");
	    }
	    else
	    {
		System.out.println(i+" is Odd");
	    }
	}

	input.close();  //closing input stream
    }
}
