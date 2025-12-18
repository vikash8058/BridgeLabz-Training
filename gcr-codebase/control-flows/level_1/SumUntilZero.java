//program to find sum until user enters zero
import java.util.Scanner;

public class SumUntilZero
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//initialize variables
	double total=0.0;
	double number;

	//get input values and compute sum
	System.out.print("Enter a number: ");
	number=input.nextDouble();

	while(number!=0)
	{
	    total=total+number;
	    System.out.print("Enter a number: ");
	    number=input.nextDouble();
	}

	System.out.println("The total sum is "+total);

	input.close();  //closing input stream
    }
}
