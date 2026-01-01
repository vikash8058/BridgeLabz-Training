package com.oppspillars.employeemanagement;

//Abstract class Employee
public abstract class Employee {

	// Encapsulated fields
	private int employeeId;
	private String name;
	private double baseSalary;

	// Constructor to initialize employee data
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Getter and Setter methods (Encapsulation)
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// Abstract method to calculate salary
	public abstract double calculateSalary();

	// Concrete method to display employee details
	public void displayDetails() {
		System.out.println("Employee ID   : " + employeeId);
		System.out.println("Employee Name : " + name);
		System.out.println("Salary        : " + calculateSalary());
		System.out.println("------------------------------");
	}
}
