package com.cabbygo;

import java.util.Scanner;

//Main class with user input using switch-case
public class CabbyGoApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Driver input
		System.out.print("Enter Driver Name: ");
		String driverName = input.nextLine();

		System.out.print("Enter License Number: ");
		String licenseNumber = input.nextLine();

		System.out.print("Enter Driver Rating: ");
		double rating = input.nextDouble();

		Driver driver = new Driver(driverName, licenseNumber, rating);
		System.out.println(driver.getDriverInfo());

		// Vehicle selection
		System.out.println("\nSelect Vehicle Type:");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. SUV");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();

		System.out.print("Enter Distance (in km): ");
		int distance = input.nextInt();

		IRideService ride;

		// Switch-case for vehicle selection (Polymorphism)
		switch (choice) {
		case 1:
			ride = new Mini("MINI-101", 4);
			break;

		case 2:
			ride = new Sedan("SEDAN-201", 4);
			break;

		case 3:
			ride = new SUV("SUV-301", 6);
			break;

		default:
			System.out.println("Invalid vehicle choice");
			input.close();
			return;
		}

		// Booking and ending the ride
		ride.bookRide(distance);
		ride.endRide();

		input.close();
	}
}
