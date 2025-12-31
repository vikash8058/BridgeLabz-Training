package com.inheritance.assistedproblems.animal;

class Birds extends Animals {
	
	public Birds(String name,int age) {
		super(name,age);  //calling parent class 
	}
	
	@Override
	void makeSound() {
		System.out.println(this.name+" Bird is chirping");
	}
}
