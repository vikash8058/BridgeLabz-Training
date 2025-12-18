//program to check if the first is the smallest of the 3 numbers
import java.util.Scanner;

public class CheckFirstNumberSmallest
{
    public static void main(String[] args)
    {
	//create a Scanner object
	Scanner input=new Scanner(System.in);

	//get the input for 3 numbers
	System.out.print("Enter the first number: ");
	int number1=input.nextInt();
	System.out.print("Enter the second number: ");
	int number2=input.nextInt();
	System.out.print("Enter the third number: ");
	int number3=input.nextInt();

	//check first number is the smallest number or not and print it 
	if(number1<number2 && number1<number3)
	{
	    System.out.println("Is the first number the smallest? Yes");
	} 
        else
	{
	    System.out.println("Is the first number the smallest? No");
	}

	input.close();  // closing the Scanner stream
    }

}
