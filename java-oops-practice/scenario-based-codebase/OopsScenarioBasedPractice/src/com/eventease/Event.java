package com.eventease;

// Base class for all events
public abstract class Event implements ISchedulable {

	// eventId should not be modified once assigned
	private final int eventId;

	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;

	// Pricing details (protected for subclasses)
	protected double venueCost;
	protected double serviceCost;
	protected double discount;

	// Organizer
	protected User organizer;

	// Constructor without services
	public Event(int eventId, String eventName, String location, String date, int attendees, User organizer) {

		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
		this.organizer = organizer;

		this.venueCost = 10000;
		this.serviceCost = 0;
		this.discount = 0;
	}

	// Constructor with catering/decoration services
	public Event(int eventId, String eventName, String location, String date, int attendees, User organizer,
			double serviceCost, double discount) {

		this(eventId, eventName, location, date, attendees, organizer);
		this.serviceCost = serviceCost;
		this.discount = discount;
	}

	// Cost calculation using operators
	protected double calculateTotalCost() {
		return venueCost + serviceCost - discount;
	}

	public int getEventId() {
		return eventId;
	}

	// Polymorphic method
	@Override
	public abstract void schedule();

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println(eventName + " rescheduled to " + date);
	}

	@Override
	public void cancel() {
		System.out.println(eventName + " has been cancelled.");
	}
}
