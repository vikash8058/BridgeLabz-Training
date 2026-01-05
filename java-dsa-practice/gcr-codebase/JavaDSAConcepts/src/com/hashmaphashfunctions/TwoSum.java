package com.hashmaphashfunctions;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] array, int target) {

		// Map to store value -> index
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {

			int current = array[i];
			int required = target - current;

			// If required value already exists, return indices
			if (map.containsKey(required)) {
				return new int[] { map.get(required), i };
			}

			// Store current value with its index
			map.put(current, i);
		}

		// If no pair found
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {

		int[] array = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(array, target);

		if (result[0] != -1) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No pair found");
		}
	}
}
