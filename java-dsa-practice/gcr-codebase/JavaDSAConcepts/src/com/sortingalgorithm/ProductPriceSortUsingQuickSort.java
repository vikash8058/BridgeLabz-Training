package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class ProductPriceSortUsingQuickSort {

	// Method to partition the array based on a pivot
	public static int partition(int[] arr, int low, int high) {
		// Choosing the last element as the pivot
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++;

				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// Place the pivot in its correct sorted position
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;

		return i; // Return the partition index
	}

	// Recursive method to perform Quick Sort
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Get the partition index
			int pidx = partition(arr, low, high);

			// Sort elements before and after partition
			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high);
		}
	}

	public static void main(String[] args) {
		// Create Scanner object with name input
		Scanner input = new Scanner(System.in);

		// Ask for the number of products
		System.out.print("Enter the number of products: ");
		int n = input.nextInt();

		// Create an array to store product prices
		int[] prices = new int[n];

		// Take dynamic input for prices
		System.out.println("Enter the prices of " + n + " products:");
		for (int i = 0; i < n; i++) {
			System.out.print("Price " + (i + 1) + ": ");
			prices[i] = input.nextInt();
		}

		// Display prices before sorting
		System.out.println("\nPrices before sorting: " + Arrays.toString(prices));

		// Call the quickSort method
		// low = 0, high = n-1
		quickSort(prices, 0, n - 1);

		// Display prices after sorting
		System.out.println("Prices after sorting (Ascending): " + Arrays.toString(prices));

		// Close the scanner
		input.close();
	}
}
