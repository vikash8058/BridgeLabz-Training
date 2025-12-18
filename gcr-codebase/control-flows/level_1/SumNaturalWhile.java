//program to find sum of n natural numbers using while loop
import java.util.Scanner;

public class SumNaturalWhile
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter the number: ");
	int number=input.nextInt();

	if(number>=0)
	{
	    int sumLoop=0;
	    int i=1;

	    while(i<=number)
	    {
		sumLoop=sumLoop+i;
		i++;
	    }

	    int sumFormula=number*(number+1)/2;

	    System.out.println("Sum using while loop is "+sumLoop);
	    System.out.println("Sum using formula is "+sumFormula);
	}
	else
	{
	    System.out.println("The number is not a natural number");
	}

	input.close();  //closing input stream
    }
}
