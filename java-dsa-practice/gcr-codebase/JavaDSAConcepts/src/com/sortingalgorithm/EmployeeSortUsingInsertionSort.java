package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class EmployeeSortUsingInsertionSort {

	// Logic for Insertion Sort as provided
	static void insertionSort(int[] arr, int n) {
		int temp, j;
		for (int i = 1; i < n; i++) {
			temp = arr[i]; // Store the current element to be inserted
			j = i;

			// Shift elements of the sorted part to the right
			// if they are greater than the temp value
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			// Insert the element at its correct position
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		// Create Scanner object with name input
		Scanner input = new Scanner(System.in);

		// Ask for the number of employees
		System.out.print("Enter the number of employees: ");
		int n = input.nextInt();

		// Create an array to store Employee IDs
		int[] employeeIDs = new int[n];

		// Take dynamic input for IDs
		System.out.println("Enter " + n + " Employee IDs:");
		for (int i = 0; i < n; i++) {
			System.out.print("ID " + (i + 1) + ": ");
			employeeIDs[i] = input.nextInt();
		}

		// Print array before sorting
		System.out.println("\nBefore Sorting: " + Arrays.toString(employeeIDs));

		// Call the insertionSort method
		insertionSort(employeeIDs, n);

		// Print array after sorting
		System.out.println("After Sorting (Ascending): " + Arrays.toString(employeeIDs));

		// Close the scanner
		input.close();
	}

}
