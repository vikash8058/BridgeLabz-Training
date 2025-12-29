/*
The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;

public class NumberGuessingGame{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//store the secret number as random number
		int secretNumber=(int)(Math.random()*100)+1 ;
		
		//maximum allowed attempt is 5
		int maxAllowedAttempts=5;
		int attempt=0;  // initial attempt is 0
		int guessNumber;  //declare the guess Number 
		
		do{
			System.out.println("Guess the number: ");
			guessNumber=input.nextInt();
			attempt++;
			
			if(guessNumber>secretNumber){
				System.out.println("Too High!!!");
			}
			else if(guessNumber<secretNumber){
				System.out.println("Too Low!!!");
			}
			else{
				System.out.println("Ohh wow....You found the number in "+attempt+" attempts, and the secret number was: "+secretNumber);
				break;
			}
		}while(attempt<maxAllowedAttempts);
		
		if(attempt==5){
			System.out.println("Sorry!!! The Game is Over now and the secret number was: "+secretNumber);
		}
		
		input.close(); //closing input stream
	}
}