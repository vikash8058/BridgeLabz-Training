package com.linkedlist.doubly;

public class LibraryManagementSystem {

	// defining Node
	static class Node {
		int bookId;
		String bookTitle;
		String author;
		String genre;
		boolean isAvailable;
		Node next;
		Node prev;

		// constructor to initializing
		public Node(int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
			this.bookId = bookId;
			this.bookTitle = bookTitle;
			this.author = author;
			this.genre = genre;
			this.isAvailable = isAvailable;
			this.next = null;
			this.prev = null;
		}
	}

	// defining head and tail
	private Node head;
	private Node tail;

	// method to add book at beginning
	public void addAtBeginning(int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
		Node newNode = new Node(bookId, bookTitle, author, genre, isAvailable);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}

		System.out.println("Book added at beginning");
	}

	// method to add book at ending
	public void addAtEnd(int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
		Node newNode = new Node(bookId, bookTitle, author, genre, isAvailable);

		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}

		System.out.println("Book added at end");
	}

	// method to add book at specific position
	public void addAtPosition(int position, int bookId, String bookTitle, String author, String genre,
			boolean isAvailable) {

		if (position <= 0) {
			System.out.println("Invalid position");
			return;
		}

		if (position == 1) {
			addAtBeginning(bookId, bookTitle, author, genre, isAvailable);
			return;
		}

		Node newNode = new Node(bookId, bookTitle, author, genre, isAvailable);
		Node temp = head;
		int count = 1;

		while (count < position - 1 && temp != null) {
			temp = temp.next;
			count++;
		}

		if (temp == null || temp.next == null) {
			addAtEnd(bookId, bookTitle, author, genre, isAvailable);
			return;
		}

		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;

		System.out.println("Book added at position: " + position);
	}

	// method to remove book by book id
	public void removeByBookId(int bookId) {

		Node temp = head;

		while (temp != null) {
			if (temp.bookId == bookId) {

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

				System.out.println("Book removed with ID: " + bookId);
				return;
			}
			temp = temp.next;
		}

		System.out.println("Book not found");
	}

	// method to search book by title
	public void searchByTitle(String bookTitle) {

		Node temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.bookTitle.equalsIgnoreCase(bookTitle)) {
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("Book not found with title: " + bookTitle);
		}
	}

	// method to search book by author
	public void searchByAuthor(String author) {

		Node temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.author.equalsIgnoreCase(author)) {
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("No books found for author: " + author);
		}
	}

	// method to update availability status
	public void updateAvailability(int bookId, boolean status) {

		Node temp = head;

		while (temp != null) {
			if (temp.bookId == bookId) {
				temp.isAvailable = status;
				System.out.println("Book availability updated");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Book not found");
	}

	// method to display books in forward direction
	public void displayForward() {

		if (head == null) {
			System.out.println("No books available");
			return;
		}

		Node temp = head;
		System.out.println("\nBooks (Forward):");

		while (temp != null) {
			displayBook(temp);
			temp = temp.next;
		}
	}

	// method to display books in reverse direction
	public void displayReverse() {

		if (tail == null) {
			System.out.println("No books available");
			return;
		}

		Node temp = tail;
		System.out.println("\nBooks (Reverse):");

		while (temp != null) {
			displayBook(temp);
			temp = temp.prev;
		}
	}

	// method to count total books
	public void countBooks() {

		int count = 0;
		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		System.out.println("Total number of books: " + count);
	}

	// Helper Method
	private void displayBook(Node node) {
		System.out.println(
				"Book ID: " + node.bookId +
				", Title: " + node.bookTitle +
				", Author: " + node.author +
				", Genre: " + node.genre +
				", Available: " + node.isAvailable
		);
	}

	public static void main(String[] args) {

		LibraryManagementSystem library = new LibraryManagementSystem();

		library.addAtBeginning(101, "Java Programming", "James Gosling", "Programming", true);
		library.addAtEnd(102, "Clean Code", "Robert Martin", "Software Engineering", true);
		library.addAtEnd(103, "Design Patterns", "Erich Gamma", "Programming", false);
		library.addAtPosition(2, 104, "Effective Java", "Joshua Bloch", "Programming", true);

		library.displayForward();
		library.displayReverse();

		library.searchByTitle("Clean Code");
		library.searchByAuthor("Joshua Bloch");

		library.updateAvailability(103, true);
		library.removeByBookId(101);

		library.displayForward();
		library.countBooks();
	}
}
