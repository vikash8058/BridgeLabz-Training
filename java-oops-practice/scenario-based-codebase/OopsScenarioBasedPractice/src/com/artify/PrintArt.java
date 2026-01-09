package com.artify;

public class PrintArt extends ArtWork implements IPurchasabale {
	
	// private data member
	private String printSize;

	// constructor without preview
	public PrintArt(String printSize) {
			super();
			this.printSize = printSize;
		}

	// constructor with preview
	public PrintArt(String title, String artist, double price, String liscenceType, String printSize) {
			super(title, artist, price, liscenceType);
			this.printSize =printSize;
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
