package com.setinterface;

import java.util.*;

public class SetToSortedList {

	// method to convert set to sorted list
	public static List<Integer> convertToSortedList(Set<Integer> set) {

		// converting set to list
		List<Integer> list = new ArrayList<>(set);

		// sorting the list
		Collections.sort(list);

		return list;
	}

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

		List<Integer> sortedList = convertToSortedList(set);

		System.out.println(sortedList);
	}
}
