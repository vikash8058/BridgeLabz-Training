package com.generics.personalisedmealplan;

class KetoMeal implements MealPlan {

	public String getCategory() {
		return "Keto";
	}

	public String getItems() {
		return "Eggs, Cheese, Meat";
	}
}
