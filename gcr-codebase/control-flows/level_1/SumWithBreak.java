//program to find sum using break statement
import java.util.Scanner;

public class SumWithBreak
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//initialize variable
	double total=0.0;

	//infinite loop
	while(true)
	{
	    System.out.print("Enter a number: ");
	    double number=input.nextDouble();

	    if(number<=0)
	    {
		break;
	    }

	    total=total+number;
	}

	System.out.println("The total sum is "+total);

	input.close();  //closing input stream
    }
}
