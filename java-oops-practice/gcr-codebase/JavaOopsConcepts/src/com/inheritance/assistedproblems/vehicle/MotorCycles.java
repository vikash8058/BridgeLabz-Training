package com.inheritance.assistedproblems.vehicle;

public class MotorCycles extends Vehicles {

	public MotorCycles(double maxSpeed, String fuelType) {
		super(maxSpeed, fuelType); // calling super class
	}

	// overriding the method of super class
	@Override
	void displayInfo() {
		System.out.println("The maximum speed of MotorCycles is: " + this.maxSpeed);
		System.out.println("and the fuel type of MotorCycles is: " + this.fuelType);
		System.out.println();
	}
}