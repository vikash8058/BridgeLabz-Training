package com.inheritance.singleinheritance.problem2;

//Subclass
public class Thermostat extends Device {

 // Additional Attribute
 private int temperatureSetting;

 // Parameterized Constructor
 public Thermostat(String deviceId, String status, int temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }

 // Method to display thermostat status
 void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}

