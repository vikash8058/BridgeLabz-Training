package com.gamebox;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	//instance variables
	private String username;
	private List<Game> ownedGames=new ArrayList<>();
	
	//constructor to initialize instance variable
	public User(String username) {
		this.username = username;
	}
	
	public void buyGame(Game game) {
		ownedGames.add(game);
		System.out.println(this.username+" purchased : "+game.getTitle());
	}
	
	//method to display the total gamesOwned
	public void showOwnedGames() {
		System.out.println("Games owned by: "+this.username);
		for(Game game:ownedGames) {
			System.out.println("- "+game.getTitle()+" ("+game.getGenre()+")");
		}
	}
}
