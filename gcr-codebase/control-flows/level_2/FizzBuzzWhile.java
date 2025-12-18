//program to print FizzBuzz using while loop
import java.util.Scanner;

public class FizzBuzzWhile
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	int counter=1;

	//check positive integer
	if(number>0)
	{
	    //loop and print FizzBuzz
	    while(counter<=number)
	    {
		if(counter%3==0 && counter%5==0)
		{
		    System.out.println("FizzBuzz");
		}
		else if(counter%3==0)
		{
		    System.out.println("Fizz");
		}
		else if(counter%5==0)
		{
		    System.out.println("Buzz");
		}
		else
		{
		    System.out.println(counter);
		}
		counter++;
	    }
	}
	else
	{
	    System.out.println(number+" is not positive number");
	}

	input.close();  //closing input stream
    }
}
