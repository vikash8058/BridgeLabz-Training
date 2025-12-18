//program to find power using for loop
import java.util.Scanner;

public class PowerFor
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

	for(int i=1;i<=power;i++)
	{
	    result=result*number;
	}

	System.out.println(result);

	input.close();  //closing input stream
    }
}
