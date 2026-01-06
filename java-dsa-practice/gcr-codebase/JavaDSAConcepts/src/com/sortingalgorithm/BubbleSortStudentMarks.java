package com.sortingalgorithm;

import java.util.Arrays;
import java.util.Scanner; // Import Scanner for dynamic input

public class BubbleSortStudentMarks {

	// Method to sort student marks using Bubble Sort
	static void bubbleSort(int[] marks) {
		int n = marks.length;

		for (int pass = 1; pass < n; pass++) {
			boolean swapped = false;

			for (int i = 0; i < n - pass; i++) {
				if (marks[i] > marks[i + 1]) {
					// Swap the elements
					int temp = marks[i];
					marks[i] = marks[i + 1];
					marks[i + 1] = temp;
					swapped = true;
				}
			}

			// If no swaps occurred, array is already sorted
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// Create a Scanner object named input for dynamic user input
		Scanner input = new Scanner(System.in);

		// Ask the user for the number of students
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();

		// Initialize the array with the size provided by the user
		int[] studentMarks = new int[n];

		// Take marks as input from the user
		System.out.println("Enter the marks for " + n + " students:");
		for (int i = 0; i < n; i++) {
			System.out.print("Mark " + (i + 1) + ": ");
			studentMarks[i] = input.nextInt();
		}

		// Display array before sorting
		System.out.println("\nBefore Sorting: " + Arrays.toString(studentMarks));

		// Call the bubbleSort method
		bubbleSort(studentMarks);

		// Display array after sorting
		System.out.println("After Sorting : " + Arrays.toString(studentMarks));

		// Close the scanner
		input.close();
	}
}