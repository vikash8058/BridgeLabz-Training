package com.oopspillars.librarymanagement;

//Book item type
public class Book extends LibraryItem implements Reservable {

	// Constructor
	public Book(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	// Loan duration for book (14 days)
	@Override
	public int getLoanDuration() {
		return 14;
	}

	// Reserve the book
	@Override
	public void reserveItem(String borrowerName) {
		if (!isBorrowed()) {
			setBorrowerName(borrowerName);
		}
	}

	// Check availability
	@Override
	public boolean checkAvailability() {
		return !isBorrowed();
	}
}
