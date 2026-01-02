package com.smarthomeautomation;

//UserController class
public class UserController {

	// Method to compare energy usage
	public void compareEnergyUsage(Appliance a1, Appliance a2) {

		if (a1.getPowerUsage() > a2.getPowerUsage()) {
			System.out.println("First appliance consumes more energy");
		} else if (a1.getPowerUsage() < a2.getPowerUsage()) {
			System.out.println("Second appliance consumes more energy");
		} else {
			System.out.println("Both appliances consume equal energy");
		}
	}
}
