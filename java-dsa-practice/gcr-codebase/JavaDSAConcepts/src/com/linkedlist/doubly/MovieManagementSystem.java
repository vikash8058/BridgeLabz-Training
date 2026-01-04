package com.linkedlist.doubly;

public class MovieManagementSystem {

	// defining Node
	static class Node {
		String title;
		String director;
		int year;
		double rating;
		Node next;
		Node prev;

		// constructor to initializing
		public Node(String title, String director, int year, double rating) {
			this.title = title;
			this.director = director;
			this.year = year;
			this.rating = rating;
			this.next = null;
			this.prev = null;
		}
	}

	// defining head and tail
	private Node head;
	private Node tail;

	// method to add at beginning
	public void addAtBeginning(String title, String director, int year, double rating) {
		Node newNode = new Node(title, director, year, rating);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}

		System.out.println("Movie added at beginning");
	}

	// method to add at ending
	public void addAtEnd(String title, String director, int year, double rating) {
		Node newNode = new Node(title, director, year, rating);

		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}

		System.out.println("Movie added at end");
	}

	// method to add a node at specific position
	public void addAtPosition(int position, String title, String director, int year, double rating) {

		if (position <= 0) {
			System.out.println("Invalid position");
			return;
		}
		if (position == 1) {
			addAtBeginning(title, director, year, rating);
			return;
		}

		Node newNode = new Node(title, director, year, rating);
		Node temp = head;
		int count = 1;
		while (count < position - 1 && temp != null) {
			temp = temp.next;
			count++;
		}
		if (temp == null || temp.next == null) {
			addAtEnd(title, director, year, rating);
			return;
		}

		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;

		System.out.println("Movie added at position: " + position);

	}

	// method to remove movie by title
	public void removeByTitle(String title) {

		Node temp = head;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {

				if (temp == head) {
					head = head.next;
					if (head != null)
						head.prev = null;
				} else if (temp == tail) {
					tail = tail.prev;
					tail.next = null;
				} else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}

				System.out.println("Movie removed: " + title);
				return;
			}
			temp = temp.next;
		}

		System.out.println("Movie not found");
	}

	// method to search movie by director
	public void searchByDirector(String director) {

		Node temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("No movies found for director: " + director);
		}
	}

	// method to search movie by rating
	public void searchByRating(double rating) {

		Node temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.rating >= rating) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("No movies found with rating >= " + rating);
		}
	}

	// method to update rating
	public void updateRating(String title, double newRating) {

		Node temp = head;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Rating updated successfully");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Movie not found");
	}

	// method to display in forward way
	public void displayForward() {

		if (head == null) {
			System.out.println("No movies available");
			return;
		}

		Node temp = head;
		System.out.println("\nMovies (Forward):");

		while (temp != null) {
			displayMovie(temp);
			temp = temp.next;
		}
	}

	// method to display in reverse way
	public void displayReverse() {

		if (tail == null) {
			System.out.println("No movies available");
			return;
		}

		Node temp = tail;
		System.out.println("\nMovies (Reverse):");

		while (temp != null) {
			displayMovie(temp);
			temp = temp.prev;
		}
	}

	// Helper Method
	private void displayMovie(Node node) {
		System.out.println("Title: " + node.title + ", Director: " + node.director + ", Year: " + node.year
				+ ", Rating: " + node.rating);
	}

	public static void main(String[] args) {

		MovieManagementSystem mms = new MovieManagementSystem();

		mms.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
		mms.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
		mms.addAtEnd("Titanic", "James Cameron", 1997, 7.9);
		mms.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.8);

		mms.displayForward();
		mms.displayReverse();

		mms.searchByDirector("Christopher Nolan");
		mms.searchByRating(8.0);

		mms.updateRating("Titanic", 8.1);
		mms.removeByTitle("Avatar");

		mms.displayForward();

	}
}
