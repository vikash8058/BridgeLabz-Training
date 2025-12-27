package com.constructor.levelone;

class Vehicle {

    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static double registrationFee = 5000;

    // Parameterized Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Rahul", "Car");
        System.out.println("Vehicle 1:");
        vehicle1.displayVehicleDetails();

        Vehicle vehicle2 = new Vehicle("Amit", "Bike");
        System.out.println("\nVehicle 2:");
        vehicle2.displayVehicleDetails();

        // Update Registration Fee
        Vehicle.updateRegistrationFee(6500);

        System.out.println("\nAfter Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
