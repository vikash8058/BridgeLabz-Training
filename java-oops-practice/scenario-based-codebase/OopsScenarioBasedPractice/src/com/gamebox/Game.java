package com.gamebox;

public abstract class Game {

	// instance variable
	private String title;
	private String genre;
	private double price;
	private double rating;

	// constructor to initialize instance variable
	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	// getters (no direct modification allowed)
	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	// apply seasonal offer
	public void applyDiscount(double percentage) {
		price = price - (price * percentage / 100);
	}

	// abstract method
	public abstract void playDemo();
}
