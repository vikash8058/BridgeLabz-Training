package com.generics.personalisedmealplan;

class Meal<T extends MealPlan> {

	T plan;

	Meal(T plan) {
		this.plan = plan;
	}

	void showMeal() {
		System.out.println(plan.getCategory() + " Meal | Items: " + plan.getItems());
	}
}
