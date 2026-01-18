package com.generics.personalisedmealplan;

class VegetarianMeal implements MealPlan {

	public String getCategory() {
		return "Vegetarian";
	}

	public String getItems() {
		return "Vegetables, Rice, Dal";
	}
}
