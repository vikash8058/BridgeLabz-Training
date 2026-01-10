package com.libraryorganizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Library {

	// method to add book to library
	public static void addBook(HashMap<String, LinkedList<Book>> catalog, HashSet<Book> bookSet, String genre,
			Book book) {
		if (bookSet.contains(book)) {
			System.out.println("Duplicate book not allowed: " + book.getTitle());
			return;
		}

		catalog.putIfAbsent(genre, new LinkedList<>());
		catalog.get(genre).add(book);
		bookSet.add(book);

		System.out.println("Book added: " + book);
	}

	// method to display library
	public static void displayLibrary(HashMap<String, LinkedList<Book>> catalog) {

		if (catalog.isEmpty()) {
			System.out.println("Library is empty.");
			return;
		}

		for (String genre : catalog.keySet()) {
			System.out.println("Genre: " + genre);
			for (Book book : catalog.get(genre)) {
				System.out.println("  " + book);
			}
		}
	}

	// method to borrow book
	public static void borrowBook(HashMap<String, LinkedList<Book>> catalog, HashSet<Book> bookSet, String genre,
			String title) {

		Book tempBook = new Book(title, "");

		if (catalog.containsKey(genre) && catalog.get(genre).remove(tempBook)) {
			bookSet.remove(tempBook);
			System.out.println("Book borrowed successfully.");
		} else {
			System.out.println("Book not found.");
		}
	}
}
