package com.objectmodeling;

import java.util.ArrayList;

class Employee {

	// instance variable
	protected int employeeId;
	protected String employeeName;

	// constructor to initialize the instance variable
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	// method to display employee details
	void displayEmployee() {
		System.out.println("Employee ID: " + this.employeeId + ", Name: " + this.employeeName);
	}
}

class Department {

	// instance variables
	protected String departmentName;
	protected ArrayList<Employee> employees = new ArrayList<>();

	// constructor to initialize department
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	// method to add employees to department
	void addEmployee(int id, String name) {
		employees.add(new Employee(id, name));
	}

	// method to display employees
	void displayEmployees() {
		System.out.println("Department: " + this.departmentName);
		for (Employee emp : employees) {
			emp.displayEmployee();
		}
	}
}

class Company {

	// instance variables
	String companyName;
	ArrayList<Department> departments = new ArrayList<Department>();

	// constructor to initialize company
	Company(String companyName) {
		this.companyName = companyName;
	}

	// method to add department
	void addDepartment(Department department) {
		departments.add(department);
	}

	// method to display company structure
	void displayCompanyDetails() {
		System.out.println("Company Name: " + companyName);
		for (Department dept : departments) {
			dept.displayEmployees();
			System.out.println();
		}
	}

	// method to delete company (composition effect)
	void deleteCompany() {
		departments.clear();
		System.out.println("Company deleted. All departments and employees are removed.");
	}
}

public class CompanyAndDepartments {
	public static void main(String[] args) {
		
		// create company object
		Company company = new Company("Tech Solutions");

		// create departments
		Department devDept = new Department("Development");
		Department hrDept = new Department("HR");

		// add employees to departments
		devDept.addEmployee(101, "Vishal");
		devDept.addEmployee(102, "Vikash");

		hrDept.addEmployee(201, "Virendra");
		hrDept.addEmployee(202, "Sakshi");

		// add departments to company
		company.addDepartment(devDept);
		company.addDepartment(hrDept);

		// display company details
		company.displayCompanyDetails();

		// delete company
		company.deleteCompany();
	}
}
