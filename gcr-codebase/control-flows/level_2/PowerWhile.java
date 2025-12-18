//program to find power using while loop
import java.util.Scanner;

public class PowerWhile
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input values
	System.out.print("Enter number: ");
	int number=input.nextInt();

	System.out.print("Enter power: ");
	int power=input.nextInt();

	int result=1;
	int counter=0;

	while(counter==power)
	{
	    result=result*number;
	    counter++;
	}

	System.out.println(result);

	input.close();  //closing input stream
    }
}
