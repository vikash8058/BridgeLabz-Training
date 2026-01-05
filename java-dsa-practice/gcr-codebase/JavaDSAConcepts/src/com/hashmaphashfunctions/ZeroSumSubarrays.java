package com.hashmaphashfunctions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubarrays {

	public static void findZeroSumSubarrays(int[] array) {

		// Map to store cumulative sum and list of indices
		Map<Integer, List<Integer>> map = new HashMap<>();

		int sum = 0;

		// To handle subarrays starting from index 0
		map.put(0, new ArrayList<>());
		map.get(0).add(-1);

		for (int i = 0; i < array.length; i++) {
			sum += array[i];

			// If same sum exists, zero-sum subarray found
			if (map.containsKey(sum)) {
				for (int startIndex : map.get(sum)) {
					System.out.println("Zero sum subarray found from index " + (startIndex + 1) + " to " + i);
				}
			}

			// Add current index to map
			map.putIfAbsent(sum, new ArrayList<>());
			map.get(sum).add(i);
		}
	}

	public static void main(String[] args) {

		int[] array = { 3, 4, -7, 1, 3, 3, 1, -4 };

		findZeroSumSubarrays(array);
	}
}
