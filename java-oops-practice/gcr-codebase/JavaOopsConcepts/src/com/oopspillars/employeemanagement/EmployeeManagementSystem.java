package com.oopspillars.employeemanagement;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate polymorphism
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // List of Employee references (Polymorphism)
        List<Employee> employeeList = new ArrayList<>();

        // Creating full-time employee
        Employee emp1 = new FullTimeEmployee(101, "Vikash", 50000);
        ((Department) emp1).assignDepartment("IT");

        // Creating part-time employee
        Employee emp2 = new PartTimeEmployee(102, "Rahul", 20, 500);
        ((Department) emp2).assignDepartment("HR");

        // Adding employees to list
        employeeList.add(emp1);
        employeeList.add(emp2);

        
        // Processing employees using Employee reference
        for (Employee emp : employeeList) {
        	System.out.println("Department    : "+((Department) emp).getDepartmentDetails());
            emp.displayDetails();
        }
    }
}
