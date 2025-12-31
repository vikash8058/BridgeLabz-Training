/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuizApplication{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Array to store quesstion
		String[] questions={
			"1. What is the size of boolean in java?\nA. 1 Bit\nB. 2 bytes\nC. 1 bytes\nD. 4 bytes",
			"2. Which keyword is used to inherit an interface into a class?\nA. extends\nB. super\nC. inherit\nD. implements",
			"3. Which loop executes atleast once?\nA. foreach\nB. while\nC. do-while\nD. for",
			"4. Which operator is used for logical AND?\nA. &&\nB. &\nC. ||\nD. |",
			"5. Which method is the entry point of Java?\nA. start()\nB. main()\nC. run()\nD. init()",
		};
		
		//store correct answers
		char[] correctAnswers={'A','D','C','A','B'};
		
		int score=0;
		
		//loop for all questions
		for(int i=0;i<questions.length;i++){
			System.out.println("\n"+questions[i]);
			System.out.println("Enter your answer (A/B/C/D) => ");
			char userAnswer=input.next().toUpperCase().charAt(0);
			
			//advance switch for answer checking
			
			switch(userAnswer){
				case 'A','B','C','D' -> {
					
					if(userAnswer==correctAnswers[i]){
						System.out.println("Correct Answer ✅");
						score+=5;
					}
					else{
						System.out.println("Wrong Answer ❌");
					}
				}
				default -> System.out.println("Invalid Option ❌");
			}
		}
		
		// Display final result
		System.out.println("\n--- Quiz Completed ---");
		System.out.println("Your Score: " + score + " out of " + questions.length*5);

		input.close(); //closing input stream
	}
}