package com.constructor.levelone;

class Student {

    // Variables with different access modifiers
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Parameterized Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public method to set CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Display Student Details
    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {

    // Parameterized Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method accessing protected member
    void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}

public class StudentDriver {
    public static void main(String[] args) {

        // Creating Student object
        Student student1 = new Student(101, "Rahul", 8.5);
        System.out.println("Student Details:");
        student1.displayStudentDetails();

        // Modifying CGPA using public method
        student1.setCGPA(8.9);
        System.out.println("\nAfter Updating CGPA:");
        System.out.println("Updated CGPA: " + student1.getCGPA());

        // Creating PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Amit", 9.1);
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayStudentDetails();
        pgStudent.displayPostgraduateDetails();
    }
}
