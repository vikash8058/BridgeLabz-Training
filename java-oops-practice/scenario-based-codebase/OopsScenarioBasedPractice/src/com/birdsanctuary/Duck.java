package com.birdsanctuary;

public class Duck extends Bird implements Swimmable{

	public Duck(String name, int id, String species) {
		super(name, id, species);
	}

	@Override
	public void eat() {
		System.out.println("Duck eats seed");
	}
	
	@Override 
	public void swim() {
		System.out.println("Ducks swim by using their webbed feet to paddle.");
	}
}
