package com.eventease;

// ConferenceEvent extends Event
public class ConferenceEvent extends Event {

	public ConferenceEvent(int eventId, String eventName, String location,
	                       String date, int attendees, User organizer,
	                       double serviceCost, double discount) {

		super(eventId, eventName, location, date, attendees,
		      organizer, serviceCost, discount);
	}

	// Polymorphic scheduling behavior
	@Override
	public void schedule() {
		System.out.println("\n📊 Conference Event Scheduled!");
		System.out.println("Event: " + eventName);
		System.out.println("Organizer: " + organizer.getName());
		System.out.println("Attendees: " + attendees);
		System.out.println("Total Cost: ₹" + calculateTotalCost());
	}
}
