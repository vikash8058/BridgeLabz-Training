package com.oopspillars.librarymanagement;

//Magazine item type
public class Magazine extends LibraryItem implements Reservable {

	// Constructor
	public Magazine(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	// Loan duration for magazine (7 days)
	@Override
	public int getLoanDuration() {
		return 7;
	}

	// Reserve the magazine
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
