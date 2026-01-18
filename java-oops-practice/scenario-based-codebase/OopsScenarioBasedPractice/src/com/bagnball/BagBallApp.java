package com.bagnball;

import java.util.ArrayList;

public class BagBallApp {

	public static void main(String[] args) {

		Bag bag1 = new Bag(101, "Red", 3);
		Bag bag2 = new Bag(102, "Blue", 2);

		Ball b1 = new Ball(1, "Yellow", "Small");
		Ball b2 = new Ball(2, "Green", "Medium");
		Ball b3 = new Ball(3, "Blue", "Large");
		Ball b4 = new Ball(4, "Red", "Small");

		bag1.addBall(b1);
		bag1.addBall(b2);
		bag1.addBall(b3);
		bag1.addBall(b4); // exceeds capacity

		bag2.addBall(b4);
		bag2.addBall(b1);

		System.out.println();
		bag1.displayBalls();
		System.out.println();
		bag2.displayBalls();

		System.out.println("\n--- All Bags Summary ---");
		ArrayList<Bag> bags = new ArrayList<>();
		bags.add(bag1);
		bags.add(bag2);

		for (Bag bag : bags) {
			bag.displayInfo();
		}

		System.out.println("\nRemoving Ball ID 2 from Bag 101");
		bag1.removeBall(2);
		bag1.displayBalls();
	}
}
