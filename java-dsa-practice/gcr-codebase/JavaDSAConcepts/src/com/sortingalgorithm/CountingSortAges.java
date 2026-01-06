package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class CountingSortAges {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Input
		System.out.print("Enter number of students: ");
		int n = input.nextInt();
		int[] ages = new int[n];

		System.out.println("Enter the ages (between 10-18):");
		for (int i = 0; i < n; i++) {
			ages[i] = input.nextInt();
		}

		countingSort(ages);

		// Output
		System.out.println("Sorted Ages: " + Arrays.toString(ages));
		input.close();
	}

	public static void countingSort(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return;

		// Find the maximum value to determine count array size
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		int[] count = new int[max + 1];
		int[] output = new int[n];

		// Store frequency of each element
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}

		// Update count array for cumulative frequency
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}

		// Build the output array
		for (int i = n - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		// Copy back to original array
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}
}
