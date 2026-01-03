package com.cabbygo;

public class Vehicle {
	
	//instance variable
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	
	private double fare;  //sensitive data

	//constructor to initialize instance variable
	public Vehicle(String vehicleNumber, int capacity, String type) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}

	// getter and setter for fare variable
	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
}
