//program to print multiplication table from 6 to 9
import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter the number: ");
	int number=input.nextInt();

	//print multiplication table
	for(int i=6;i<=9;i++)
	{
	    System.out.println(number+" * "+i+" = "+(number*i));
	}

	input.close();  //closing input stream
    }
}
