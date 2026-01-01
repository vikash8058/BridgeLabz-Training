package com.oopspillars.librarymanagement;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {

	public static void main(String[] args) {

		// List of LibraryItem references (Polymorphism)
		List<LibraryItem> items = new ArrayList<>();

		items.add(new Book(1, "Effective Java", "Joshua Bloch"));
		items.add(new Magazine(2, "Time", "Editorial Team"));
		items.add(new DVD(3, "Inception", "Christopher Nolan"));

		// Iterating over all library items
		for (LibraryItem item : items) {

			item.getItemDetails();

			Reservable r = (Reservable) item;
			System.out.println("Available : " + r.checkAvailability());

			r.reserveItem("User123");
			System.out.println("Available After Reserve : " + r.checkAvailability());

			System.out.println("----------------------------------");
		}
	}
}
