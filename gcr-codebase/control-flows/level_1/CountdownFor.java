//program to countdown using for loop
import java.util.Scanner;

public class CountdownFor
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value for counter
	System.out.print("Enter the countdown value: ");
	int counter=input.nextInt();

	//countdown using for loop
	for(int i=counter;i>=1;i--)
	{
	    System.out.println(i);
	}

	input.close();  //closing input stream
    }
}
