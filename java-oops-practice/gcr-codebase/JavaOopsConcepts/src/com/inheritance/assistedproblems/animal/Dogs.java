package com.inheritance.assistedproblems.animal;

class Dogs extends Animals {
	
	public Dogs(String name,int age) {
		super(name,age);  //calling parent class 
	}
	
	@Override
	void makeSound() {
		System.out.println(this.name+" Dog is barking");
	}
}
