package com.inheritance.assistedproblems.employee;

public class EmployeeHierarchy {
	public static void main(String[] args) {
		
		Employees manager=new Managers("Manager", 101, 75000.50);  //creating object of manager class
		manager.displayDetails();
		
		Employees developer=new Developers("Developer", 102, 70000.); //creating object of developer class
		developer.displayDetails();
		
		Employees intern=new Interns("Intern", 103, 5000);  //creating object of intern class
		intern.displayDetails();
		
		
	}
}
