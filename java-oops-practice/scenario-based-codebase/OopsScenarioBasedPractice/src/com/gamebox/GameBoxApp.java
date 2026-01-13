package com.gamebox;

public class GameBoxApp {
	public static void main(String[] args) {

		User user = new User("Vikash Prajapati");

		Game arcade = new ArcadeGame("Speed Racer", 299, 4.5);
		Game strategy = new StrategyGame("Empire Builder", 499, 4.7);

		// apply seasonal discount
		arcade.applyDiscount(20);
		strategy.applyDiscount(10);
		
		// demo play
		arcade.playDemo();
		strategy.playDemo();

		System.out.println("-----------------------------------");
		
		// download and purchase
		((ArcadeGame) arcade).download();
		((StrategyGame) strategy).download();

		System.out.println("-----------------------------------");
		
		user.buyGame(arcade);
		user.buyGame(strategy);
		
		System.out.println("-----------------------------------");

		user.showOwnedGames();
	}
}
