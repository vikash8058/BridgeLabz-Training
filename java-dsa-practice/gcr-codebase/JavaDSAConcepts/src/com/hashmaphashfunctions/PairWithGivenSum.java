package com.hashmaphashfunctions;


import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

	public static boolean hasPairWithSum(int[] array, int targetSum) {

		// Map to store visited numbers
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {

			int current = array[i];
			int required = targetSum - current;

			// Check if required number already exists
			if (map.containsKey(required)) {
				System.out.println("Pair found: " + current + " + " + required + " = " + targetSum);
				return true;
			}

			// Store current number
			map.put(current, i);
		}

		return false;
	}

	public static void main(String[] args) {

		int[] array = { 8, 7, 2, 5, 3, 1 };
		int targetSum = 10;

		boolean result = hasPairWithSum(array, targetSum);

		if (!result) {
			System.out.println("No pair found with given sum");
		}
	}
}
