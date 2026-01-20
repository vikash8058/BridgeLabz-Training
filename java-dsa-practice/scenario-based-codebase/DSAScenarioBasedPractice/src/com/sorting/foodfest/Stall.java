	package com.sorting.foodfest;

public class Stall {

	private String name;
	private int footfall;

	public Stall(String name, int footfall) {
		this.name = name;
		this.footfall = footfall;
	}

	public int getFootfall() {
		return footfall;
	}

	@Override
	public String toString() {
		return name + " | Footfall: " + footfall;
	}
}
