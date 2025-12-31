package com.inheritance.assistedproblems.animal;

public class AnimalHierarchy {
	public static void main(String[] args) {
		
		Animals dog=new Dogs("German Shepherd ",15);
		dog.viewDetails();
		dog.makeSound();
		System.out.println();
		
		Animals cat=new Cats("Lucy",5);
		cat.viewDetails();
		cat.makeSound();
		System.out.println();
		
		Animals bird=new Birds("Parrot ",8);
		bird.viewDetails();
		bird.makeSound();
		
	}
}
