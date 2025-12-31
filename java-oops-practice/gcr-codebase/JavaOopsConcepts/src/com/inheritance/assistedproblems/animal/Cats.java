package com.inheritance.assistedproblems.animal;

class Cats extends Animals {
	
	public Cats(String name,int age) {
		super(name,age);  //calling parent class 
	}
	
	@Override
	void makeSound() {
		System.out.println(this.name+" Cat doing Meows");
	}
}
