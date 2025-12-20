//program to check whether a given number is positive, negative or zero
import java.util.Scanner;

public class CheckPossitiveNegative{
	
	//method to find whether it is positive, negative or zero
	int checkPositiveNegative(int number){
		if(number<0){
			return -1;
		}
		else if(number==0){
			return 0;
		}
		return 1;
	}
	public static void main(String[] args){
		//create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//creating objecct of the class
		CheckPossitiveNegative checkPosNeg=new CheckPossitiveNegative();
	
		//get a input values for number
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		
		//calling the method to check number whether it is positive or negative or zero
		int result=checkPosNeg.checkPositiveNegative(number);
		
		//display result
		System.out.println(result);
		
		input.close(); //closing the input stream
	}
}