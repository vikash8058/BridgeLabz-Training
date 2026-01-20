package com.sorting.movietime;

public class MovieTimeManager {

	public void insertShow(Show[] shows, int size) {

		Show key = shows[size - 1];
		int j = size - 2;

		while (j >= 0 && shows[j].getTime() > key.getTime()) {
			shows[j + 1] = shows[j];
			j--;
		}

		shows[j + 1] = key;
	}

	public void display(Show[] shows, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(shows[i]);
		}
	}
}
