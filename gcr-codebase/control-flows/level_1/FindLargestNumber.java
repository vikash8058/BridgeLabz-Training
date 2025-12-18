//program to check if the first, second, or third number is the largest of the three
import java.util.Scanner;

public class FindLargestNumber
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

	
	if(number1>number2 && number1>number3)  //check first number is largest element and display the result                
	{ 
	    System.out.println("Is the first number the largest? Yes"+
			       "\nIs the second number the largest? No"+	
			       "\nIs the third number the largest? No");
	}
	else if(number2>number1 && number2>number3)   //check second number is largest element and display the result
	{
	    System.out.println("Is the first number the largest? No"+
			       "\nIs the second number the largest? Yes"+	
			       "\nIs the third number the largest? No");
	}
	else  //check third number is largest element and display the result
	{
	    System.out.println("Is the first number the largest? No"+
			       "\nIs the second number the largest? No"+	
			       "\nIs the third number the largest? Yes");
	}
	
	input.close();  //closing the Scanner stream
    }
}