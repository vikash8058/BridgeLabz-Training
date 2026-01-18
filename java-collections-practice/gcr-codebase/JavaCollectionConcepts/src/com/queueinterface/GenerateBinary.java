package com.queueinterface;

import java.util.*;

public class GenerateBinary {

	public static void generate(int n) {

		Queue<String> q = new LinkedList<>();
		q.add("1");

		for (int i = 0; i < n; i++) {
			String s = q.remove();
			System.out.print(s + " ");

			q.add(s + "0");
			q.add(s + "1");
		}
	}

	public static void main(String[] args) {
		generate(5);
	}
}
