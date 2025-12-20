//program to calculte the total number of rounds to complete 5 km of traingular park
import java.util.Scanner;

public class CalculateRounds{
	
	// method to find out the number of rounds
	int findRounds(int firstSide, int secondSide, int thirdSide){
		int perimeter=firstSide+secondSide+thirdSide;
		double rounds = 5000.0 / perimeter;

        return (int) Math.ceil(rounds);
	}
	public static void main(String[] args){
		//create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//create the object of class
		CalculateRounds calRounds=new CalculateRounds();
		
		//get input values for the sides in meteres
		System.out.print("Enter the first side: ");
		int firstSide=input.nextInt();
		System.out.print("Enter the second side: ");
		int secondSide=input.nextInt();
		System.out.print("Enter the third side: ");
		int thirdSide=input.nextInt();
		
		//call method to find out the rounds
		int rounds=calRounds.findRounds(firstSide,secondSide,thirdSide);
		
		System.out.println("Number of rounds required to complete 5 km run: "+rounds); //display result
		
		input.close(); //close the input stream
	}

}