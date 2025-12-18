// program to perform basic operation 
import java.util.Scanner;

public class BasicOperation
{
    public static void main(String[] args)
    {
	//declare variables
	double number1, number2;

	Scanner input=new Scanner(System.in);  //Scanner object
	
	number1=input.nextDouble();  //taking first number input
	number2=input.nextDouble();  //taking second number input

	double addition=number1+number2;         //calcualating addition
	double subtraction=number1-number2;      //calculating subtraction
	double multiplication=number1*number2;   //calculating multiplication
	double division=number1/number2;         //calculating division
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", and " + division);  //Display the result
	
	input.close();  //closing the Scanner object
    }
}