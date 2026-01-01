package com.oopspillars.librarymanagement;

//Abstract class representing a generic Library Item
public abstract class LibraryItem {

	// Encapsulated fields
	private int itemId;
	private String title;
	private String author;

	// Sensitive borrower information (secured)
	private String borrowerName;

	// Constructor
	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// Getter methods (Encapsulation)
	public int getItemId() {
		return itemId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// Protected method to assign borrower securely
	protected void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	// Check if item is currently borrowed
	protected boolean isBorrowed() {
		return borrowerName != null;
	}

	// Abstract method to define loan duration
	public abstract int getLoanDuration();

	// Concrete method to display item details
	public void getItemDetails() {
		System.out.println("Item ID   : " + itemId);
		System.out.println("Title     : " + title);
		System.out.println("Author    : " + author);
		System.out.println("Loan Days : " + getLoanDuration());
	}
}
