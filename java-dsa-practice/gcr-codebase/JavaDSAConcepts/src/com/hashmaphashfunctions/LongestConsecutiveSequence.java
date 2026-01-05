package com.hashmaphashfunctions;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] array) {

		if (array.length == 0) {
			return 0;
		}

		// Store all elements in a HashSet
		Set<Integer> set = new HashSet<>();
		for (int num : array) {
			set.add(num);
		}

		int longestStreak = 0;

		// Check each number as potential start of sequence
		for (int num : set) {

			// Only start counting if num-1 does not exist
			if (!set.contains(num - 1)) {

				int currentNum = num;
				int currentStreak = 1;

				// Count consecutive numbers
				while (set.contains(currentNum + 1)) {
					currentNum++;
					currentStreak++;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}

	public static void main(String[] args) {

		int[] array = { 100, 4, 200, 1, 3, 2 };

		int result = longestConsecutive(array);

		System.out.println("Length of longest consecutive sequence: " + result);
	}
}
