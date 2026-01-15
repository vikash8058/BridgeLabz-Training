package com.sorting.smartshelf;

public class SmartShelfApp {
	public static void main(String[] args) {

		SmartShelfManager manager = new SmartShelfManager();
		// reading list (fixed size for demo)
		Book[] shelf = new Book[10];
		int size = 0;

		// real-time book additions
		shelf[size++] = new Book("Java Basics");
		manager.insertionSort(shelf, size);

		shelf[size++] = new Book("Data Structures");
		manager.insertionSort(shelf, size);

		shelf[size++] = new Book("Algorithms");
		manager.insertionSort(shelf, size);

		shelf[size++] = new Book("Artificial Intelligence");
		manager.insertionSort(shelf, size);

		System.out.println("Sorted Reading List:");
		manager.displayBooks(shelf, size);
	}

}
