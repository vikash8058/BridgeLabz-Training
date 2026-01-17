package com.sorting.artexpo;

public class Artist {

	// instance variable
	private String name;
	private int registrationTime; // stored as minutes since 00:00

	public Artist(String name, int hour, int minute) {
		this.name = name;
		this.registrationTime = hour * 60 + minute;
	}

	public String getName() {
		return name;
	}

	public int getRegistrationTime() {
		return registrationTime;
	}

	// converts minutes → HH:MM
	private String formatTime() {
		int hour = registrationTime / 60;
		int minute = registrationTime % 60;
		return String.format("%02d:%02d", hour, minute);
	}

	@Override
	public String toString() {
		return name + " registered at " + formatTime();
	}
}
