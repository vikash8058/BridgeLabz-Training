package com.oppspillars.employeemanagement;

//Full-time employee with fixed salary
public class FullTimeEmployee extends Employee implements Department {

	private String department;

	// Constructor
	public FullTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}

	// Salary calculation for full-time employee
	@Override
	public double calculateSalary() {
		return getBaseSalary();
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
