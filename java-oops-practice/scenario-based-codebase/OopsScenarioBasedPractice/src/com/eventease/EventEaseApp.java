package com.eventease;

import java.util.Scanner;

public class EventEaseApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Organizer details
		System.out.print("Enter Organizer Name: ");
		String name = input.nextLine();

		System.out.print("Enter Organizer Email: ");
		String email = input.nextLine();

		User organizer = new User(name, email);

		// Event details
		System.out.print("Enter Event ID: ");
		int eventId = input.nextInt();
		input.nextLine();

		System.out.print("Enter Event Name: ");
		String eventName = input.nextLine();

		System.out.print("Enter Location: ");
		String location = input.nextLine();

		System.out.print("Enter Date: ");
		String date = input.nextLine();

		System.out.print("Enter Number of Attendees: ");
		int attendees = input.nextInt();

		System.out.print("Enter Service Cost (Catering/Decoration): ");
		double serviceCost = input.nextDouble();

		System.out.print("Enter Discount Amount: ");
		double discount = input.nextDouble();

		System.out.println("\nSelect Event Type:");
		System.out.println("1. Birthday");
		System.out.println("2. Conference");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();

		Event event;

		// Enhanced switch for event creation
		event = switch (choice) {
			case 1 -> new BirthdayEvent(eventId, eventName, location,
			                            date, attendees, organizer,
			                            serviceCost, discount);
			case 2 -> new ConferenceEvent(eventId, eventName, location,
			                               date, attendees, organizer,
			                               serviceCost, discount);
			default -> {
				System.out.println("Invalid choice. Defaulting to Birthday Event.");
				yield new BirthdayEvent(eventId, eventName, location,
				                         date, attendees, organizer,
				                         serviceCost, discount);
			}
		};

		// Schedule event
		event.schedule();

		// Optional reschedule
		System.out.print("\nDo you want to reschedule? (yes/no): ");
		input.nextLine();
		String res = input.nextLine();

		if (res.equalsIgnoreCase("yes")) {
			System.out.print("Enter new date: ");
			String newDate = input.nextLine();
			event.reschedule(newDate);
		}

		input.close();
	}
}
