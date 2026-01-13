package com.homenest;

public class HomeNestApp {

	public static void main(String[] args) {

		IControllable light = new Light(101);
		IControllable camera = new Camera(102);
		IControllable thermostat = new Thermostat(103);
		IControllable lock = new Lock(104);

		light.turnOn();
		camera.turnOn();
		thermostat.turnOn();
		lock.turnOn();

		System.out.println();

		light.reset();
		camera.reset();
		thermostat.reset();
		lock.reset();
	}
}
