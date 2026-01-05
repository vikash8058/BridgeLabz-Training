package com.collegeinformationsystem;

public class Faculty extends Person{

	public Faculty(String name, String email, int id) {
		super(name, email, id);
	}
	
	@Override
	public void printDetails() {
		System.out.println(
				"Faculty name: " + this.name + ", email: " + this.email + ", id: " + this.id);
	}
}
