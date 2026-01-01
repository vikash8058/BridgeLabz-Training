package com.oopspillars.librarymanagement;

//DVD item type
public class DVD extends LibraryItem implements Reservable {

	// Constructor
	public DVD(int itemId, String title, String author) {
		super(itemId, title, author);
	}

	// Loan duration for DVD (3 days)
	@Override
	public int getLoanDuration() {
		return 3;
	}

	// Reserve the DVD
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
