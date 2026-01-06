package com.petpal;

import java.util.Scanner;

public class PetPalApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to PetPal 🐾");

		// -------- Pet Selection --------
		System.out.println("Choose Pet Type:");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Bird");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		input.nextLine();

		System.out.print("Enter Pet Name: ");
		String name = input.nextLine();

		System.out.print("Enter Pet Age: ");
		int age = input.nextInt();

		Pet pet;

		// Enhanced switch for pet creation
		pet = switch (choice) {
		case 1 -> new Dog(name, age);
		case 2 -> new Cat(name, age);
		case 3 -> new Bird(name, age);
		default -> {
			System.out.println("Invalid choice. Default pet assigned (Dog).");
			yield new Dog(name, age);
		}
		};

		boolean running = true;

		while (running) {

			System.out.println("\nChoose Action:");
			System.out.println("1. Feed");
			System.out.println("2. Play");
			System.out.println("3. Sleep");
			System.out.println("4. Make Sound");
			System.out.println("5. Show Status");
			System.out.println("6. Exit");

			System.out.print("Enter option: ");
			int action = input.nextInt();

			// Enhanced switch for actions
			switch (action) {
			case 1 -> pet.feed();
			case 2 -> pet.play();
			case 3 -> pet.sleep();
			case 4 -> pet.makeSound();
			case 5 -> pet.showStatus();
			case 6 -> running = false;
			default -> System.out.println("Invalid option. Try again.");
			}
		}

		System.out.println("\nThanks for using PetPal 🐶🐱🐦");
		input.close();
	}
}
