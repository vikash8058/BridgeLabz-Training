package com.eventease;

// BirthdayEvent extends Event
public class BirthdayEvent extends Event {

	public BirthdayEvent(int eventId, String eventName, String location, String date, int attendees, User organizer,
			double serviceCost, double discount) {

		super(eventId, eventName, location, date, attendees, organizer, serviceCost, discount);
	}

	// Polymorphic scheduling behavior
	@Override
	public void schedule() {
		System.out.println("\n🎂 Birthday Event Scheduled!");
		System.out.println("Event: " + eventName);
		System.out.println("Organizer: " + organizer.getName());
		System.out.println("Total Cost: ₹" + calculateTotalCost());
	}
}
