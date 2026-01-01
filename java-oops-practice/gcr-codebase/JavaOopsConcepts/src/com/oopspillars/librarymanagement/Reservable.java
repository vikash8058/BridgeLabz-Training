package com.oopspillars.librarymanagement;

//Interface for reserving library items
public interface Reservable {

	// Reserve the item
	void reserveItem(String borrowerName);

	// Check availability status
	boolean checkAvailability();
}
