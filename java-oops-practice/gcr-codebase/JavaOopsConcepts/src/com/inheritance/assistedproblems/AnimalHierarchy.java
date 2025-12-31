package com.inheritance.assistedproblems;

class Animal {
	
	// instance variable
	protected String name;
	protected int age;
	
	//constructor to initialize instance variable
	public Animal(String name, int age) {
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

class Dog extends Animal {
	
	public Dog(String name,int age) {
		super(name,age);  //calling parent class 
	}
	
	@Override
	void makeSound() {
		System.out.println(this.name+" Dog is barking");
	}
}

class Cat extends Animal {
	
	public Cat(String name,int age) {
		super(name,age);  //calling parent class 
	}
	
	@Override
	void makeSound() {
		System.out.println(this.name+" Cat doing Meows");
	}
}

class Bird extends Animal {
	
	public Bird(String name,int age) {
		super(name,age);  //calling parent class 
	}
	
	@Override
	void makeSound() {
		System.out.println(this.name+" Bird is chirping");
	}
}

public class AnimalHierarchy {
	public static void main(String[] args) {
		
		Animal dog=new Dog("German Shepherd ",15);
		dog.viewDetails();
		dog.makeSound();
		System.out.println();
		
		Animal cat=new Cat("Lucy",5);
		cat.viewDetails();
		cat.makeSound();
		System.out.println();
		
		Animal bird=new Bird("Parrot ",8);
		bird.viewDetails();
		bird.makeSound();
		
	}
}
