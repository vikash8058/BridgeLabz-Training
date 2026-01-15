package com.sorting.hospitalqueue;

public class Patient {

	// instance variable
	private String name;
	private int criticality;

	// constructors to initialize instance variable
	public Patient(String name, int criticality) {
		this.name = name;
		this.criticality = criticality;
	}

	// getter to return the private attributes
	public String getName() {
		return name;
	}

	public int getCriticality() {
		return criticality;
	}

}
