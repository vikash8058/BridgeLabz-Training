package com.sorting.gamerzone;

public class Player {

	private String name;
	private int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return name + " | Score: " + score;
	}
}
