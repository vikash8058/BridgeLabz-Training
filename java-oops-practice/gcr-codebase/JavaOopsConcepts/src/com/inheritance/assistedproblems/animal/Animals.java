package com.inheritance.assistedproblems.animal;

public class Animals {
	
	// instance variable
	protected String name;
	protected int age;
	
	//constructor to initialize instance variable
	public Animals(String name, int age) {
		this.name=name;
		this.age=age;
	}

	// method to make sound
	void makeSound() {
		System.out.println("Animal make sound");
	}
	
	//to show the details of animals
	void viewDetails() {
		System.out.println("The name of Animal is: "+this.name);
		System.out.println("The age of "+this.name+" is "+this.age+" years");
	}
}
