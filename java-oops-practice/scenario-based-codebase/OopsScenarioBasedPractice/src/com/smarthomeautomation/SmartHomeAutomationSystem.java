package com.smarthomeautomation;

//Main class to demonstrate polymorphism
public class SmartHomeAutomationSystem {

	public static void main(String[] args) {

		Controllable light = new Light(40);
		Controllable fan = new Fan(75);
		Controllable ac = new AC(1500);

		// Polymorphic behavior
		light.turnOn();
		fan.turnOn();
		ac.turnOn();

		light.turnOff();
		fan.turnOff();
		ac.turnOff();

		// Energy comparison
		UserController controller = new UserController();
		controller.compareEnergyUsage((Appliance) fan, (Appliance) ac);
	}
}
