package com.fitnesstracker;

public class CardioWorkout extends Workout {

	public CardioWorkout( int duaration) {
		super("Cardio", duaration);
	}

	// Calories calculation for cardio
	@Override
	public void calculateCalories() {
		caloriesBurned = duration * 8; // operator usage
	}
}
