package com.gamebox;

public class StrategyGame extends Game implements IDownloadable {

	public StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	@Override
	public void download() {
		System.out.println(getTitle() + " (Strategy) downloaded successfully");
	}

	@Override
	public void playDemo() {
		System.out.println("playing tactical strategy demo of " + getTitle());
	}
}
