package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSortBooks {

	// Method to merge two sorted halves into one sorted part
	public static void conquer(int[] arr, int si, int mid, int ei) {
		// Create a temporary array to store merged values
		int[] merged = new int[ei - si + 1];
		int idx1 = si; // Index for the first half
		int idx2 = mid + 1; // Index for the second half
		int x = 0; // Index for the merged array

		// Compare elements from both halves and add the smaller one to merged array
		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		// Copy remaining elements of the first half (if any)
		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}

		// Copy remaining elements of the second half (if any)
		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}

		// Copy the sorted elements from merged array back to the original array
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

	// Method to recursively divide the array into halves
	public static void divide(int[] arr, int si, int ei) {
		// Base case: if the array has only one element, it's already sorted
		if (si >= ei) {
			return;
		}

		// Calculate the middle point
		int mid = si + (ei - si) / 2;

		// Divide the left part
		divide(arr, si, mid);
		// Divide the right part
		divide(arr, mid + 1, ei);

		// Merge the sorted parts
		conquer(arr, si, mid, ei);
	}

	public static void main(String[] args) {
		// Create a Scanner object named input
		Scanner input = new Scanner(System.in);

		// Ask the user for the number of books
		System.out.print("Enter the number of books: ");
		int n = input.nextInt();

		// Create an array to store book prices
		int[] prices = new int[n];

		// Take prices as input from the user
		System.out.println("Enter the prices of " + n + " books:");
		for (int i = 0; i < n; i++) {
			System.out.print("Price " + (i + 1) + ": ");
			prices[i] = input.nextInt();
		}

		// Print prices before sorting
		System.out.println("\nPrices before sorting: " + Arrays.toString(prices));

		// Call the divide method (starts the Merge Sort process)
		// si = 0 (start index), ei = n-1 (end index)
		divide(prices, 0, n - 1);

		// Print prices after sorting
		System.out.println("Prices after sorting (Ascending): " + Arrays.toString(prices));

		// Close the scanner
		input.close();
	}
}