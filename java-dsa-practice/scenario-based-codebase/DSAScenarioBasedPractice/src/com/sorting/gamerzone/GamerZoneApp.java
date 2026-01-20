package com.sorting.gamerzone;

public class GamerZoneApp {

	public static void main(String[] args) {

		Player[] players = {
				new Player("Alex", 4500),
				new Player("Riya", 7200),
				new Player("Sam", 6100),
				new Player("Neha", 8200),
				new Player("John", 5000)
		};

		GamerZoneSorter sorter = new GamerZoneSorter();
		sorter.quickSort(players, 0, players.length - 1);
		sorter.display(players);
	}
}
