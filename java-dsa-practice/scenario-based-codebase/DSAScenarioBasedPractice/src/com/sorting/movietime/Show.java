package com.sorting.movietime;

public class Show {

	private String movieName;
	private int time; // minutes since 00:00

	public Show(String movieName, int hour, int minute) {
		this.movieName = movieName;
		this.time = hour * 60 + minute;
	}

	public int getTime() {
		return time;
	}

	@Override
	public String toString() {
		return movieName + " at " + String.format("%02d:%02d", time / 60, time % 60);
	}
}
