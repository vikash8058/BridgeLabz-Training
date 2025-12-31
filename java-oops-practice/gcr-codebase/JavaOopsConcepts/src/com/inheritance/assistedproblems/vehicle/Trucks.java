package com.inheritance.assistedproblems.vehicle;

public class Trucks extends Vehicles{

	public Trucks(double maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
	}
	
	@Override
	void displayInfo() {
		System.out.println("The maximum speed of Truck is: " + this.maxSpeed);
		System.out.println("and the fuel type of Truck is: " + this.fuelType);
		System.out.println();
	}
}
