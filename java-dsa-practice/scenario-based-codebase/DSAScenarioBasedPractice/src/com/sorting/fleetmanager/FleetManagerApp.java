package com.sorting.fleetmanager;

public class FleetManagerApp {

	public static void main(String[] args) {

		// merged lists from multiple depots (already sorted individually)
		Vehicle[] vehicles = {
				new Vehicle("DL-101", 12000),
				new Vehicle("DL-102", 18000),
				new Vehicle("MH-201", 13000),
				new Vehicle("MH-202", 20000),
				new Vehicle("KA-301", 15000), new Vehicle("KA-302", 22000)
		};

		FleetManagerSorter sorter = new FleetManagerSorter();

		System.out.println("Before Creating Master Schedule:");
		sorter.display(vehicles);

		sorter.divide(vehicles, 0, vehicles.length - 1);

		System.out.println("\nMaster Maintenance Schedule (By Mileage):");
		sorter.display(vehicles);
	}
}
