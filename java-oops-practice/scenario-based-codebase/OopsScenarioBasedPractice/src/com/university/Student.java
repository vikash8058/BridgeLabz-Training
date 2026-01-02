package com.university;

//Base class Student
public class Student {

	// Encapsulated fields
	private int studentId;
	private String name;
	private double gpa; // internal GPA (secured)

	// Constructor without elective preference
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	// Constructor with elective preference
	public Student(int studentId, String name, String elective) {
		this.studentId = studentId;
		this.name = name;
	}

	// Protected method to update GPA securely
	protected void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// Public method to access transcript
	public String getTranscript() {
		return "Student ID: " + studentId + ", Name: " + name + ", GPA: " + gpa;
	}
}
