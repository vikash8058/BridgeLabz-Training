package com.sorting.smartshelf;

public class SmartShelfManager {

	// method to sort the books according to title(insertion sorting)
	public void insertionSort(Book[] books, int size) {

		for (int i = 1; i < size; i++) {
			Book key = books[i];
			int j = i - 1;

			while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
				books[j + 1] = books[j];
				j--;
			}

			// insert book at correct position
			books[j + 1] = key;
		}
	}

	// method to display the books
	public void displayBooks(Book[] books, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(books[i].getTitle());
		}
	}
}
