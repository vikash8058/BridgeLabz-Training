//program to countdown using while loop
import java.util.Scanner;

public class CountdownWhile
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value for counter
	System.out.print("Enter the countdown value: ");
	int counter=input.nextInt();

	//countdown using while loop
	while(counter>=1)
	{
	    System.out.println(counter);
	    counter--;
	}

	input.close();  //closing input stream
    }
}
