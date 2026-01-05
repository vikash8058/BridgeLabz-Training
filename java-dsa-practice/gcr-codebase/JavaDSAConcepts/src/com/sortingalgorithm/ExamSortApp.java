package com.sortingalgorithm;

import java.util.Scanner;

public class ExamSortApp {

	// Method to perform Selection Sort
	public static void selectionSort(int[] arr) {
		int n = arr.length;

		// Loop through the entire array
		for (int i = 0; i < n - 1; i++) {
			// Find the index of the minimum element
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j; // Found a smaller score
				}
			}

			// Swap the found minimum element with the current element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		// Create Scanner object with name input
		Scanner input = new Scanner(System.in);

		// Get size of the array
		System.out.print("Enter number of scores: ");
		int size = input.nextInt();

		int[] scores = new int[size];

		// Get array elements from user
		System.out.println("Enter the scores:");
		for (int i = 0; i < size; i++) {
			scores[i] = input.nextInt();
		}

		// Call the selectionSort method
		selectionSort(scores);

		// Print the sorted array
		System.out.println("Scores sorted in ascending order:");
		for (int score : scores) {
			System.out.print(score + " ");
		}

		// Close the scanner
		input.close();
	}
}