package com.personalizedlearningplatform;

import java.util.*;

public class EduMentorApp {

	public static void main(String[] args) {

		// Scanner object named 'input'
		Scanner input = new Scanner(System.in);

		//  Learner Details
		System.out.print("Enter Learner Name: ");
		String name = input.nextLine();

		System.out.print("Enter Email: ");
		String email = input.nextLine();

		System.out.print("Enter User ID: ");
		int userId = input.nextInt();
		input.nextLine(); // consume newline

		System.out.print("Enter Course Type (short / full-time): ");
		String courseType = input.nextLine();

		Learner learner = new Learner(name, email, userId, courseType);

		//Static Quiz Questions
		List<String> questions = Arrays.asList("What is Java?", "What is OOPS?", "What is JVM?");

		List<String> correctAnswers = Arrays.asList("Programming Language", "Object Oriented Programming",
				"Java Virtual Machine");

		List<String> userAnswers = new ArrayList<>();

		System.out.println("\n--- Quiz Started ---");

		// Take User Answers
		for (int i = 0; i < questions.size(); i++) {
			System.out.println("\nQ" + (i + 1) + ": " + questions.get(i));
			System.out.print("Your Answer: ");
			userAnswers.add(input.nextLine());
		}

		// Create Quiz
		Quiz quiz = new Quiz(questions, correctAnswers, "Medium");

		// Evaluate Quiz
		quiz.evaluate(userAnswers);

		double percentage = quiz.calcualatePercentage();
		learner.setPercentage(percentage);

		//Result
		System.out.println("\n--- Quiz Result ---");
		System.out.println("Score Percentage: " + percentage + "%");

		// Certificate Generation 
		learner.generateCertificate();

		// Close scanner
		input.close();
	}
}
