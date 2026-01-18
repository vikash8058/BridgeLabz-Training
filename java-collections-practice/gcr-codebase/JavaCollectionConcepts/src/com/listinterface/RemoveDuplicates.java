package com.listinterface;

import java.util.*;

public class RemoveDuplicates {

	// method to remove duplicates while preserving order
	public static List<Integer> removeDuplicates(List<Integer> list) {

		Set<Integer> seen = new HashSet<>();
		List<Integer> result = new ArrayList<>();

		// traversing the list
		for (int num : list) {

			// adding only first occurrence
			if (!seen.contains(num)) {
				seen.add(num);
				result.add(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

		List<Integer> output = removeDuplicates(list);

		System.out.println(output);
	}
}
