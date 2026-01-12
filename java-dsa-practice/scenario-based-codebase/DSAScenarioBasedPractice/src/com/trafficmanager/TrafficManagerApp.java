package com.trafficmanager;

public class TrafficManagerApp {

	public static void main(String[] args) {

		TrafficManager manager = new TrafficManager();

		manager.enterVehicle("CAR-101");
		manager.enterVehicle("CAR-102");
		manager.enterVehicle("CAR-103");
		manager.enterVehicle("CAR-104"); // goes to queue

		manager.displayRoundabout();

		manager.exitVehicle("CAR-102");

		manager.displayRoundabout();
	}
}
