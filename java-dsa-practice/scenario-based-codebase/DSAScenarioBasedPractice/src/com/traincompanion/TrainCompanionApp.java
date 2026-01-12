package com.traincompanion;

public class TrainCompanionApp {
	public static void main(String[] args) {
		TrainManager train = new TrainManager();

		train.addCompartment("Sleeper");
		train.addCompartment("Pantry");
		train.addCompartment("AC");
		train.addCompartment("General");

		train.displayAdjacent();

		train.moveForward();
		train.displayAdjacent();

		train.moveForward();
		train.displayAdjacent();

		train.moveBackward();
		train.displayAdjacent();

		train.removeCompartment("Pantry");
		train.displayAdjacent();
	}
}
