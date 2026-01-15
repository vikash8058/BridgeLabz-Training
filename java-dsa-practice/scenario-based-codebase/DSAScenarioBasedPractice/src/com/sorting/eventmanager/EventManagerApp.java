package com.sorting.eventmanager;

public class EventManagerApp {

	public static void main(String[] args) {
		EventManager manager=new EventManager();
		
		Ticket[] tickets = {
				new Ticket("Concert", 1200),
				new Ticket("Conference", 500),
				new Ticket("Movie", 300),
				new Ticket("Sports", 2500),
				new Ticket("Theatre", 800)
		};

		System.out.println("Before Sorting:");
		manager.display(tickets);

		manager.quickSort(tickets, 0, tickets.length - 1);

		System.out.println("\nAfter Sorting by Price (Ascending):");
		manager.display(tickets);
	}
}
