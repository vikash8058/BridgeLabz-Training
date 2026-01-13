package com.gamebox;

public class ArcadeGame extends Game implements IDownloadable {

	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	@Override
	public void download() {
		System.out.println(getTitle() + " (Arcade) downloaded successfully");
	}

	@Override
	public void playDemo() {
		System.out.println("playing fast-paced arcade demo of " + getTitle());
	}
}
