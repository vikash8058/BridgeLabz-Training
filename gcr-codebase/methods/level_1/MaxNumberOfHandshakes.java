//program to find maximum number of handshakes
import java.util.Scanner;

public class MaxNumberOfHandshakes{
	
	// method to find the maximum possible numnber of handshakes
	int findMaxNumberOfHandshakes(int numberOfStudent){
		int result=(numberOfStudent * (numberOfStudent - 1)) / 2;  //formula to find maximum possible handshakes
		return result;   //return the result
	}
	
	public static void main(String[] args){
		
		//create an Scanner object
		Scanner input=new Scanner(System.in);
		
		//get the input value  for number of student
		System.out.print("Enter the number of Student: ");
		int numberOfStudent=input.nextInt();
		
		//creating object of the class
		MaxNumberOfHandshakes maxNumberOfHandshakes=new MaxNumberOfHandshakes();
		
		//call the method to find the maximum no. of handshakes
		int maxHandshakes=maxNumberOfHandshakes.findMaxNumberOfHandshakes(numberOfStudent);
		
		//display the result
		System.out.println("The number of possible handshakes: "+maxHandshakes);
		
		input.close(); //closing the input stream	
	}
}