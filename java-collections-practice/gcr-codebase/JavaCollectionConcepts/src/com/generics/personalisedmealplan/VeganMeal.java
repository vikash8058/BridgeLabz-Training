package com.generics.personalisedmealplan;

class VeganMeal implements MealPlan {

	public String getCategory() {
		return "Vegan";
	}

	public String getItems() {
		return "Fruits, Beans, Nuts";
	}
}
