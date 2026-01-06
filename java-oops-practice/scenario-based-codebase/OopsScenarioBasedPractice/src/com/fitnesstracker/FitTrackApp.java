package com.fitnesstracker;

import java.util.Scanner;

public class FitTrackApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// User Profile 
		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.print("Enter Age: ");
		int age = input.nextInt();

		System.out.print("Enter Weight: ");
		double weight = input.nextDouble();
		input.nextLine();

		System.out.print("Enter Goal (or press Enter for default): ");
		String goal = input.nextLine();

		UserProfile user;

		if (goal.isEmpty()) {
			user = new UserProfile(name, age, weight);
		} else {
			user = new UserProfile(name, age, weight, goal);
		}

		user.showProfile();

		//  Workout Selection
		System.out.println("\nChoose Workout Type:");
		System.out.println("1. Cardio");
		System.out.println("2. Strength");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();

		System.out.print("Enter Workout Duration (minutes): ");
		int duration = input.nextInt();

		Workout workout;

		if (choice == 1) {
			workout = new CardioWorkout(duration);
		} else {
			workout = new StrengthWorkout(duration);
		}

		// Workout Tracking
		workout.startWorkout();
		workout.calculateCalories();
		workout.stopWorkout();

		//Progress Calculation 
		double caloriesBurned = workout.getCaloriesBurned();
		double remainingCalories = user.getDailyCalorieTarget() - caloriesBurned;

		System.out.println("\nCalories Burned: " + caloriesBurned);
		System.out.println("Remaining Daily Calories: " + remainingCalories);

		input.close(); //closing input stream
	}
}
