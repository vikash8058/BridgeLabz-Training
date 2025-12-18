//program to check whether a number is positive, negative or zero
import java.util.Scanner;

public class CheckNumber
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value for number
	System.out.print("Enter the number: ");
	int number=input.nextInt();

	//check the number and display the result
	if(number>0)
	{
	    System.out.println("The number is positive");
	}
	else if(number<0)
	{
	    System.out.println("The number is negative");
	}
	else
	{
	    System.out.println("The number is zero");
	}

	input.close();  //closing input stream
    }
}
