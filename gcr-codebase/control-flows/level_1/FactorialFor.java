//program to find factorial using for loop
import java.util.Scanner;

public class FactorialFor
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
	    int factorial=1;

	    for(int i=1;i<=number;i++)
	    {
		factorial=factorial*i;
	    }

	    System.out.println("The factorial of "+number+" is "+factorial);
	}
	else
	{
	    System.out.println("Please enter a positive integer");
	}

	input.close();  //closing input stream
    }
}
