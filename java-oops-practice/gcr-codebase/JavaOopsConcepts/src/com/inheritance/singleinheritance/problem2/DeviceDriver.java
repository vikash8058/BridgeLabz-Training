package com.inheritance.singleinheritance.problem2;

public class DeviceDriver {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-101", "ON",24);
        System.out.println("Smart Home Device Status:");
        thermostat.displayStatus();
    }
}
