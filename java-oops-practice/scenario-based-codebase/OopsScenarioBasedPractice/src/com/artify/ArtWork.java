package com.artify;

public abstract class ArtWork {

	// instance variable
	protected String title;
	protected String artist;
	protected String liscenceType;

	// private data member
	private double price;

	// constructor without previews
	public ArtWork() {
		this.title = "Sketch";
		this.artist = "Anuj Dwivedi";
		this.price = 4500.00;
		this.liscenceType = "Annual";
	}

	// constructor with preview
	public ArtWork(String title, String artist, double price, String liscenceType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.liscenceType = liscenceType;
	}

	// get the price
	public double getPrice() {
		return price;
	}

}
