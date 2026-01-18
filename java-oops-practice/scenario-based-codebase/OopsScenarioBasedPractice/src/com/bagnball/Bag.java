package com.bagnball;

import java.util.ArrayList;

public class Bag implements Storable {

	// instance variable
	private int id;
	private String color;
	private int capacity;
	private ArrayList<Ball> balls;

	public Bag(int id, String color, int capacity) {
		this.id = id;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<Ball>();
	}

	@Override
	public int getId() {
		return this.id;
	}

	public int getBallCount() {
		return balls.size();
	}

	// method to add ball
	public void addBall(Ball ball) {
		if (balls.size() >= capacity) {
			System.out.println("Bag is full! cannot add ball Id: " + ball.getId());
			return;
		}

		balls.add(ball);
		System.out.println("Ball added to bag: " + this.id);
	}

	// method to remove ball by id
	public void removeBall(int ballId) {
		for (Ball b : balls) {
			if (b.getId() == ballId) {
				balls.remove(b);
				System.out.println("Ball removed from bag: " + id);
				return;
			}
		}
		System.out.println("Ball not found in Bag " + id);
	}

	// method to display all balls
	public void displayBalls() {
		System.out.println("Balls in Bag " + id + ":");
		if (balls.isEmpty()) {
			System.out.println("No balls in this bag.");
			return;
		}
		for (Ball b : balls) {
			b.displayInfo();
		}
	}

	@Override
	public void displayInfo() {
		System.out.println(
				"Bag ID: " + id + ", Color: " + color + ", Capacity: " + capacity + ", Balls Stored: " + balls.size());
	}

}
