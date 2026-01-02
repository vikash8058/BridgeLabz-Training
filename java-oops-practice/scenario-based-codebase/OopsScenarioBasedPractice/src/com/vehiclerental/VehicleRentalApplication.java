package com.vehiclerental;

// Main class to demonstrate polymorphism
public class VehicleRentalApplication {

	public static void main(String[] args) {

		Customer customer = new Customer("Vikash");

		Rentable bike = new Bike("B101", 300,"Bike");
		Rentable car = new Car("C201", 1000,"Car");
		Rentable truck = new Truck("T301", 2000,"Truck");

		int days = 3;

		// Polymorphic rent calculation
		System.out.println("Customer: " + customer.getCustomerName());
		System.out.println("Bike Rent  : " + bike.calculateRent(days));
		System.out.println("Car Rent   : " + car.calculateRent(days));
		System.out.println("Truck Rent : " + truck.calculateRent(days));
	}
}
