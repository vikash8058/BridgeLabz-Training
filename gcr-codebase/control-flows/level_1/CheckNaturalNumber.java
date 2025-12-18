// program to check for the natural number and find out the sum of n natural numbers
import java.util.Scanner;
public class CheckNaturalNumber
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get an input value for a number
	System.out.print("Enter the number: ");
	int number=input.nextInt();

	//check that the number is natural number if yes then find the sum of n natural number
	if(number>=0)
	{
	    //find the sum of that natural number and display the result
	    int sum=number*(number+1)/2;     
	    System.out.println("The sum of "+number+" natural numbers is "+sum);
	}
	else
	{
	    System.out.println("The number "+number+" is not a natural number");
	}

	input.close();  //closing input stream
    }

}