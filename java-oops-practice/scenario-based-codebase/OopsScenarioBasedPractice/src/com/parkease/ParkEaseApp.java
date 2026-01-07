package com.parkease;

import java.util.Scanner;

public class ParkEaseApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Create parking slot
		ParkingSlot slot = new ParkingSlot(101, "Car");

		// Vehicle input
		System.out.println("Select Vehicle Type:");
		System.out.println("1. Car");
		System.out.println("2. Bike");
		System.out.println("3. Truck");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		input.nextLine();

		System.out.print("Enter Vehicle Number: ");
		String number = input.nextLine();

		Vehicle vehicle;

		// Enhanced switch for vehicle creation
		vehicle = switch (choice) {
		case 1 -> new Car(number);
		case 2 -> new Bike(number);
		case 3 -> new Truck(number);
		default -> {
			System.out.println("Invalid choice. Defaulting to Car.");
			yield new Car(number);
		}
		};

		// Assign parking slot
		if (slot.assignSlot(vehicle)) {

			System.out.print("Enter Parking Duration (hours): ");
			int hours = input.nextInt();

			double charges = vehicle.calculateCharges(hours);
			System.out.println("Parking Charges: ₹" + charges);

			slot.releaseSlot();
		} else {
			System.out.println("Slot not available or vehicle not allowed.");
		}

		// Show logs
		slot.showLogs();

		input.close();
	}
}
