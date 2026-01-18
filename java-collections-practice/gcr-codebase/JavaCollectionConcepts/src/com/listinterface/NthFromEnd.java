package com.listinterface;

import java.util.*;

public class NthFromEnd {

	// method to find nth element from end
	public static String findNthFromEnd(LinkedList<String> list, int n) {

		// directly accessing element from end
		return list.get(list.size() - n);
	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

		String result = findNthFromEnd(list, 2);

		System.out.println(result);
	}
}
