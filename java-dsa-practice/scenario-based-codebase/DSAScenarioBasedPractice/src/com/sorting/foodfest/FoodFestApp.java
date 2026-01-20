package com.sorting.foodfest;

public class FoodFestApp {

	public static void main(String[] args) {

		Stall[] stalls = {
				new Stall("Burger Hub", 1200),
				new Stall("Pizza Zone", 1800),
				new Stall("Taco Town", 1500),
				new Stall("Sweet Treats", 1800),
				new Stall("Spice Corner", 1000)
		};

		FoodFestSorter sorter = new FoodFestSorter();
		sorter.divide(stalls, 0, stalls.length - 1);
		sorter.display(stalls);
	}
}
