package com.petpal;

import java.util.Random;

// Base class representing a generic pet
public abstract class Pet implements IInteractable {

	protected String name;
	protected String type;
	protected int age;

	// Internal states (encapsulated)
	private int hunger; // 0 to 100
	private int energy; // 0 to 100
	private int mood; // 0 to 100

	// Constructor with random default values
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;

		Random random = new Random();
		this.hunger = random.nextInt(50) + 30; // 30–80
		this.energy = random.nextInt(50) + 30;
		this.mood = random.nextInt(50) + 30;
	}

	// Feed pet → decreases hunger, increases mood
	@Override
	public void feed() {
		hunger = hunger - 20;
		mood = mood + 10;
		normalizeLevels();
		System.out.println(name + " has been fed.");
	}

	// Play with pet → decreases energy, increases mood
	@Override
	public void play() {
		energy = energy - 20;
		mood = mood + 20;
		hunger = hunger + 10;
		normalizeLevels();
		System.out.println(name + " enjoyed playing.");
	}

	// Sleep → increases energy, decreases hunger slightly
	@Override
	public void sleep() {
		energy = energy + 30;
		hunger = hunger + 10;
		normalizeLevels();
		System.out.println(name + " is sleeping.");
	}

	// Ensure values stay between 0 and 100
	private void normalizeLevels() {
		hunger = Math.max(0, Math.min(100, hunger));
		energy = Math.max(0, Math.min(100, energy));
		mood = Math.max(0, Math.min(100, mood));
	}

	// Display pet status
	public void showStatus() {
		System.out.println("\n--- Pet Status ---");
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Age: " + age);
		System.out.println("Hunger: " + hunger);
		System.out.println("Energy: " + energy);
		System.out.println("Mood: " + mood);
	}

	// Polymorphic method
	public abstract void makeSound();
}
