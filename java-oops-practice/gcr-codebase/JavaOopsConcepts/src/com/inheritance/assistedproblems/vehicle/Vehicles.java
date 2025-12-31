package com.inheritance.assistedproblems.vehicle;

public class Vehicles{
	
	//instance variables
	protected double maxSpeed;
	protected String fuelType;
	
	//constructor to initialize the instance variable
	public Vehicles(double maxSpeed, String fuelType) {
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	
	//method to view information
	void displayInfo() {
		System.out.println("Vehicles is the super Class ");
	}
}
