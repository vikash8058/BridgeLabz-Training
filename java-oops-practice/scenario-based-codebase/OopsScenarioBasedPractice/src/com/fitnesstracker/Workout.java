package com.fitnesstracker;

public abstract class Workout implements ITrackable {
	
	//instance variable
	protected String type;
	protected int duration;
	protected double caloriesBurned;
	
	//constructor to initialize the instance variable
	public Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;
	}
	
	public abstract void calculateCalories();
	
	@Override
	public void startWorkout() {
		System.out.println(this.type+" workout started");
	}
	
	@Override
	public void stopWorkout() {
		System.out.println(this.type+" workout completed");
	}
	
	public double getCaloriesBurned() {
		 return caloriesBurned;
	}	
}
