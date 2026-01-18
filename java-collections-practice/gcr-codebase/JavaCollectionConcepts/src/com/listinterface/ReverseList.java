package com.listinterface;

import java.util.*;

public class ReverseList {

	// generic method to reverse any list
	public static <T> void reverse(List<T> list) {

		int start = 0;
		int end = list.size() - 1;

		// swapping elements from both ends
		while (start < end) {
			T temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		// reversing ArrayList
		List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		reverse(arrayList);
		System.out.println(arrayList);

		// reversing LinkedList
		List<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));
		reverse(linkedList);
		System.out.println(linkedList);
	}
}
