package com.artify;

public class DigitalArt extends ArtWork implements IPurchasabale {

	// private data member
	private String resolution;

	// constructor without preview
	public DigitalArt(String resolution) {
		super();
		this.resolution = resolution;
	}

	// constructor with preview
	public DigitalArt(String title, String artist, double price, String liscenceType, String resolution) {
		super(title, artist, price, liscenceType);
		this.resolution = resolution;
	}

	// overriding purchase method
	@Override
	public void purchase(User user) {
		if (user.getWalletBalance() >= getPrice()) {
			user.deductBalance(getPrice());
			System.out.println("Digital Art purchased successfully");
		} else {
			System.out.println("Insufficient wallet balance");
		}
	}

	@Override
	public void liscence() {
		System.out.println("Digital art Liscence Type: " + this.liscenceType);
		System.out.println("Usage allowed for personal and commercial use only");
	}
}
