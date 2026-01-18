package com.setinterface;

import java.util.*;

public class SymmetricDifference {

	// method to find symmetric difference
	public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {

		Set<Integer> result = new HashSet<>(set1);

		// removing common elements
		result.removeAll(set2);

		// finding elements only in set2
		Set<Integer> temp = new HashSet<>(set2);
		temp.removeAll(set1);

		// combining both unique parts
		result.addAll(temp);

		return result;
	}

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

		Set<Integer> output = findSymmetricDifference(set1, set2);

		System.out.println(output);
	}
}
