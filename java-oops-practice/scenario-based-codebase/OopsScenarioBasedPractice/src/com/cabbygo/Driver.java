package com.cabbygo;

public class Driver {

	//instance variable
	private String name;
	private String licenseNumber;
	private double rating;
	
	//constructor to initialize instance variable
	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	//method to get driver info
	
	public String getDriverInfo() {
		return "Driver: " + name + ", License: " + licenseNumber;
	}
}
