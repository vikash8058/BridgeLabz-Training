//program to find factorial using while loop
import java.util.Scanner;

public class FactorialWhile
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
	    int i=1;

	    while(i<=number)
	    {
		factorial=factorial*i;
		i++;
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
