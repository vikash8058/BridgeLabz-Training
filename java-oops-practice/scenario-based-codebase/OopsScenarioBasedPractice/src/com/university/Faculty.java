package com.university;

//Faculty class responsible for grading
public class Faculty implements Graded {

	private String facultyName;
	private Student student;

	public Faculty(String facultyName, Student student) {
		this.facultyName = facultyName;
		this.student = student;
	}

	// Assign grade and calculate GPA
	@Override
	public void assignGrade(double grade) {
		double gpa = grade / 10; // GPA calculation using operators
		student.setGpa(gpa);
	}
}
