package com.setinterface;

import java.util.*;

public class CheckSubset {

	// method to check if set1 is subset of set2
	public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {

		// checking if all elements of set1 exist in set2
		return set2.containsAll(set1);
	}

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		boolean result = isSubset(set1, set2);

		System.out.println(result);
	}
}
