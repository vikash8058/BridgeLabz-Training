package com.libraryorganizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BookSelfApp {
	public static void main(String[] args) {

		// define the hash map for storing books
		HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

		// hash set to prevent duplicate books
		HashSet<Book> bookSet = new HashSet<Book>();

		// creating book object
		Book b1 = new Book("Java", "James Gosling");
		Book b2 = new Book("Python", "Guido van Rossum");
		Book b3 = new Book("Data Structures", "Mark Allen Wiess");
		Book b4 = new Book("Java", "Someone else");

		// ADD BOOKS TO LIBRARY
		Library.addBook(catalog, bookSet, "Programming", b1);
		Library.addBook(catalog, bookSet, "Programming", b2);
		Library.addBook(catalog, bookSet, "Computer Science", b3);
		Library.addBook(catalog, bookSet, "Programming", b4); // duplicate check

		// DISPLAY LIBRARY
		System.out.println("------ Library Catalog ------");
		Library.displayLibrary(catalog);

		// BORROW BOOK
		System.out.println("\nBorrowing book: Java from Programming");
		Library.borrowBook(catalog, bookSet, "Programming", "Java");

		// ---------- DISPLAY AFTER BORROW ----------
		System.out.println("\n------ Library After Borrow ------");
		Library.displayLibrary(catalog);
	}
}
