package com.birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

	public Seagull(String name, int id, String species) {
		super(name, id, species);
	}

	@Override
	protected void eat() {
		System.out.println("Seagull eats fish and scraps.");
	}

	@Override
	public void fly() {
		System.out.println("Seagull flies over the sea.");
	}

	@Override
	public void swim() {
		System.out.println("Seagull swims briefly on water.");
	}
}
