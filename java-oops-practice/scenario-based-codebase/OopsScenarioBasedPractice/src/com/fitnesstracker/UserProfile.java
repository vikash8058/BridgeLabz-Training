package com.fitnesstracker;

public class UserProfile {

	// instance variable
	private String name;
	private int age;
	private double weight;
	private String goal;
	private double dailyCalorieTarget;

	// constructor to initialize instance variable
	public UserProfile(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = "Maintain Fitness";
		this.dailyCalorieTarget = 2000;
	}

	// constructor with custom goal
	public UserProfile(String name, int age, double weight, String goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.dailyCalorieTarget = 2500;
	}

	public double getWeight() {
		return weight;
	}

	public double getDailyCalorieTarget() {
		return dailyCalorieTarget;
	}

	public void showProfile() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Goal: " + goal);
		System.out.println("Daily Calorie Target: " + dailyCalorieTarget);
	}
}
