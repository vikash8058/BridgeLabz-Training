package com.birdsanctuary;

public class Penguin extends Bird implements Swimmable{

	public Penguin(String name, int id, String species) {
		super(name, id, species);
	}

	@Override
	public void eat() {
		System.out.println("Penguin eats fish");
	}

	@Override
	public void swim() {
		System.out.println("Penguin swims efficiently");
	}

}
