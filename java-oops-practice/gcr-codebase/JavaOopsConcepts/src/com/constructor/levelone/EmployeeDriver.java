package com.constructor.levelone;

class Employee {

    // Variables with access modifiers
    public int employeeID;
    protected String department;
    private double salary;

    // Parameterized Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Display Employee Details
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass to demonstrate protected access
class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeDriver {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "IT", 60000);
        System.out.println("Employee Details:");
        emp1.displayEmployeeDetails();

        emp1.setSalary(65000);
        System.out.println("\nAfter Salary Update:");
        System.out.println("Updated Salary: " + emp1.getSalary());

        Manager manager = new Manager(201, "HR", 90000);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
