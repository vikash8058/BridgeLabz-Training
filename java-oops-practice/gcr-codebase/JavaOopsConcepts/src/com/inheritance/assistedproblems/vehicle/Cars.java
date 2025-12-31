package com.inheritance.assistedproblems.vehicle;

class Cars extends Vehicles{
	
	public Cars(double maxSpeed, String fuelType) {
		super(maxSpeed,fuelType);  //calling super class
	}
	
	//overriding the method of super class
	@Override 
	void displayInfo() {
		System.out.println("The maximum speed of Car is: "+this.maxSpeed);
		System.out.println("and the fuel type of Car is: "+this.fuelType);
		System.out.println();
	}
}
