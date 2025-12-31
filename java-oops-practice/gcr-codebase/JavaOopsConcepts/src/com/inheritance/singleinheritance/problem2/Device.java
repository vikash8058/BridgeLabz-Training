package com.inheritance.singleinheritance.problem2;

//Superclass
public class Device {

 // Attributes
 protected String deviceId;
 protected String status;

 // Parameterized Constructor
 public Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 // Method to display device status
 void displayStatus() {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + status);
 }
}
