package com.linkedlist.circular;

public class OnlineTicketReservationSystem {

	// defining Node
	static class Node {
		int ticketId;
		String customerName;
		String movieName;
		String seatNumber;
		String bookingTime;
		Node next;

		// constructor to initializing
		public Node(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
			this.ticketId = ticketId;
			this.customerName = customerName;
			this.movieName = movieName;
			this.seatNumber = seatNumber;
			this.bookingTime = bookingTime;
			this.next = null;
		}
	}

	// defining head
	private Node head;

	// method to add ticket at end
	public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {

		Node newNode = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}

		System.out.println("Ticket booked successfully");
	}

	// method to remove ticket by ticket id
	public void removeTicket(int ticketId) {

		if (head == null) {
			System.out.println("No tickets booked");
			return;
		}

		Node temp = head;
		Node prev = null;

		// if head ticket needs to be removed
		if (head.ticketId == ticketId) {

			if (head.next == head) {
				head = null;
			} else {
				while (temp.next != head) {
					temp = temp.next;
				}
				temp.next = head.next;
				head = head.next;
			}

			System.out.println("Ticket removed with ID: " + ticketId);
			return;
		}

		prev = head;
		temp = head.next;

		while (temp != head) {
			if (temp.ticketId == ticketId) {
				prev.next = temp.next;
				System.out.println("Ticket removed with ID: " + ticketId);
				return;
			}
			prev = temp;
			temp = temp.next;
		}

		System.out.println("Ticket not found");
	}

	// method to display all tickets
	public void displayTickets() {

		if (head == null) {
			System.out.println("No tickets available");
			return;
		}

		Node temp = head;
		System.out.println("\nBooked Tickets:");

		do {
			displayTicket(temp);
			temp = temp.next;
		} while (temp != head);
	}

	// method to search ticket by customer name
	public void searchByCustomerName(String customerName) {

		if (head == null) {
			System.out.println("No tickets available");
			return;
		}

		Node temp = head;
		boolean found = false;

		do {
			if (temp.customerName.equalsIgnoreCase(customerName)) {
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No ticket found for customer: " + customerName);
		}
	}

	// method to search ticket by movie name
	public void searchByMovieName(String movieName) {

		if (head == null) {
			System.out.println("No tickets available");
			return;
		}

		Node temp = head;
		boolean found = false;

		do {
			if (temp.movieName.equalsIgnoreCase(movieName)) {
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No tickets found for movie: " + movieName);
		}
	}

	// method to count total booked tickets
	public void countTickets() {

		if (head == null) {
			System.out.println("Total booked tickets: 0");
			return;
		}

		int count = 0;
		Node temp = head;

		do {
			count++;
			temp = temp.next;
		} while (temp != head);

		System.out.println("Total booked tickets: " + count);
	}

	// Helper Method
	private void displayTicket(Node node) {
		System.out.println("Ticket ID: " + node.ticketId + ", Customer: " + node.customerName + ", Movie: "
				+ node.movieName + ", Seat: " + node.seatNumber + ", Time: " + node.bookingTime);
	}

	public static void main(String[] args) {

		OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();

		system.addTicket(101, "Rahul", "Inception", "A1", "10:30 AM");
		system.addTicket(102, "Priya", "Interstellar", "B5", "11:00 AM");
		system.addTicket(103, "Amit", "Inception", "C3", "11:30 AM");

		system.displayTickets();

		System.out.println("\nSearch by Customer Name:");
		system.searchByCustomerName("Rahul");

		System.out.println("\nSearch by Movie Name:");
		system.searchByMovieName("Inception");

		system.countTickets();

		system.removeTicket(102);
		system.displayTickets();
		system.countTickets();
	}
}
