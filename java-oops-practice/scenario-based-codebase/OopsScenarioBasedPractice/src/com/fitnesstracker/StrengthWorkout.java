package com.fitnesstracker;

public class StrengthWorkout extends Workout {

	public StrengthWorkout( int duaration) {
		super("Strength", duaration);
	}

	// Calories calculation for strength training
	@Override
	public void calculateCalories() {
		caloriesBurned = duration * 6; // operator usage
	}
}
