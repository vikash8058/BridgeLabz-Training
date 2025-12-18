//program to check if a number is divisible by 5
import java.util.Scanner;

public class DivisibleBy5
{
    public static void main(String[] args)
    {
	//create a Scanner object
	Scanner input=new Scanner(System.in);

	//get input value for number 
	System.out.print("Enter the number: ");
	int number=input.nextInt();

	//check if number is divisible by 5 and print Yes or No
	if(number%5==0)
	{	
	    System.out.println(" Is the number "+ number+" divisible by 5? Yes");
	}
	else
	{
	    System.out.println(" Is the number "+ number+" divisible by 5? No");
	}	

	input.close();  //closing the Scanner stream
	
    }
}