package com.collegeinformationsystem;

public class Person {

	// instance variable
	protected String name;
	protected String email;
	protected int id;

	// constructor to initialize instance variable
	public Person(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	public void printDetails() {
		System.out.println("Name: " + name + ", Email: " + email + ", ID: " + id);
	}
}
