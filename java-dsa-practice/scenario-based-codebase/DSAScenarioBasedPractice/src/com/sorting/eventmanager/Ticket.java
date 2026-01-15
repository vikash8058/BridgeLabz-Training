package com.sorting.eventmanager;

public class Ticket {

	// instance variable
	private String eventName;
	private int price;

	// constructor to initialize instance variable
	public Ticket(String eventName, int price) {
		this.eventName = eventName;
		this.price = price;
	}

	// getters
	public int getPrice() {
		return price;
	}

	public String getEventName() {
		return eventName;
	}

	@Override
	public String toString() {
		return eventName + " - ₹" + price;
	}

}
