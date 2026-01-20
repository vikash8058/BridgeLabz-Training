package com.sorting.movietime;

public class MovieTimeApp {

	public static void main(String[] args) {

		Show[] shows = new Show[10];
		int size = 0;

		MovieTimeManager manager = new MovieTimeManager();

		shows[size++] = new Show("Avatar", 18, 30);
		manager.insertShow(shows, size);

		shows[size++] = new Show("Inception", 15, 0);
		manager.insertShow(shows, size);

		shows[size++] = new Show("Interstellar", 21, 0);
		manager.insertShow(shows, size);

		shows[size++] = new Show("Joker", 17, 0);
		manager.insertShow(shows, size);

		manager.display(shows, size);
	}
}
