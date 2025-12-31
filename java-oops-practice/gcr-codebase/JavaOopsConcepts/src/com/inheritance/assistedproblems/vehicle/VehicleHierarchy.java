package com.inheritance.assistedproblems.vehicle;

public class VehicleHierarchy {
	public static void main(String[] args) {
		
		Vehicles car=new Cars(500,"CNG");
		car.displayInfo();
		
		Vehicles truck=new Trucks(80,"Diesel");
		truck.displayInfo();
		
		Vehicles motorCycle=new MotorCycles(300,"Petrol");
		motorCycle.displayInfo();
	}
}
