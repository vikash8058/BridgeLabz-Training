package com.inheritance.assistedproblems.employee;

public class Employees{
	
	//instance variables
	protected String name;
	protected int id;
	protected double salary;
	
	//constructor to initialize the instance variable
	public Employees(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	//method to display the details of employee
	void displayDetails() {
		System.out.println("\nThe employee is "+this.name+", his id "+this.id+", and the salary is "+this.salary);
	}
}