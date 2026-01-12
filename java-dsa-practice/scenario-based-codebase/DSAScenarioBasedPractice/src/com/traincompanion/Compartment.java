package com.traincompanion;

public class Compartment {
	
	//node that store compartments
	String name;
	Compartment next;
	Compartment prev;
	
	//constructor 
	Compartment(String name){
		this.name=name;
	}
}
