package com.oopspillars.employeemanagement;

//Part-time employee paid based on work hours
public class PartTimeEmployee extends Employee implements Department {

	private int workHours;
	private double hourlyRate;
	private String department;

	// Constructor
	public PartTimeEmployee(int employeeId, String name, int workHours, double hourlyRate) {
		super(employeeId, name, 0);
		this.workHours = workHours;
		this.hourlyRate = hourlyRate;
	}

	// Salary calculation based on work hours
	@Override
	public double calculateSalary() {
		return workHours * hourlyRate;
	}

	// Assign department
	@Override
	public void assignDepartment(String departmentName) {
		this.department = departmentName;
	}

	// Get department details
	@Override
	public String getDepartmentDetails() {
		return department;
	}
}
