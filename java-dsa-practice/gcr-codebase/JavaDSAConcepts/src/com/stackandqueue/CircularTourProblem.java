package com.stackandqueue;

public class CircularTourProblem {

	public static int findStartingPoint(int[] petrol, int[] distance) {

		int totalPetrol = 0;
		int currentPetrol = 0;
		int startIndex = 0;

		for (int i = 0; i < petrol.length; i++) {

			int diff = petrol[i] - distance[i];

			totalPetrol += diff;
			currentPetrol += diff;

			// If current petrol becomes negative, reset start point
			if (currentPetrol < 0) {
				startIndex = i + 1;
				currentPetrol = 0;
			}
		}

		// If total petrol is negative, no solution exists
		return totalPetrol >= 0 ? startIndex : -1;
	}

	public static void main(String[] args) {

		int[] petrol = { 4, 6, 7, 4 };
		int[] distance = { 6, 5, 3, 5 };

		int result = findStartingPoint(petrol, distance);

		if (result == -1) {
			System.out.println("No circular tour possible");
		} else {
			System.out.println("Start tour at petrol pump index: " + result);
		}
	}
}
