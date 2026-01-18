package com.generics.personalisedmealplan;

class MealGenerator {

	// validates and generates meal plan
	static <T extends MealPlan> Meal<T> generateMeal(T plan) {

		return new Meal<>(plan);
	}
}
