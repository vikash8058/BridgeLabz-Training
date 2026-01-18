package com.bagnball;

public class Ball implements Storable {

	// instance variable
	private int id;
	private String color;
	private String size; // small/medium/large

	// constructor to initialize instance variable
	public Ball(int id, String color, String size) {
		this.id = id;
		this.color = color;
		this.size = size;
	}

	@Override
	public int getId() {
		return this.id;
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	@Override
	public void displayInfo() {
		System.out.println("Ball Id: " + this.id + ", Color: " + this.color + ", Size: " + this.size);
	}
}
