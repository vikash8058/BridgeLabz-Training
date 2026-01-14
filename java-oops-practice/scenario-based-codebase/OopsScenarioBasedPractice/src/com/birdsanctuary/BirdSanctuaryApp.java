package com.birdsanctuary;

public class BirdSanctuaryApp {

	public static void main(String[] args) {

		SanctuaryManager manager = new SanctuaryManager();

		manager.addBird(new Eagle("Rocky", 1, "Golden Eagle"));
		manager.addBird(new Duck("Daffy", 2, "Mallard"));
		manager.addBird(new Penguin("Pingu", 3, "Emperor Penguin"));
		manager.addBird(new Seagull("Sky", 4, "Herring Gull"));
		manager.addBird(new Kiwi("Kiki", 5, "Brown Kiwi"));
		manager.addBird(new Ostrich("Ozzy", 6, "African Ostrich"));

		manager.displayAllBirds();
		manager.displayFlyingBirds();
		manager.displaySwimmingBirds();

		manager.removeBirdById(5);

		manager.sanctuaryReport();
	}
}
