package com.generics.personalisedmealplan;

public class MealPlanSystem {

	public static void main(String[] args) {

		Meal<VegetarianMeal> m1 = MealGenerator.generateMeal(new VegetarianMeal());

		Meal<VeganMeal> m2 = MealGenerator.generateMeal(new VeganMeal());

		Meal<KetoMeal> m3 = MealGenerator.generateMeal(new KetoMeal());

		Meal<HighProteinMeal> m4 = MealGenerator.generateMeal(new HighProteinMeal());

		m1.showMeal();
		m2.showMeal();
		m3.showMeal();
		m4.showMeal();
	}
}
