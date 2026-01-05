package com.collegeinformationsystem;

public class Student extends Person implements ICourseActions {
	private double grade;

	public Student(String name, String email, int id) {
		super(name, email, id);
		this.grade = 0;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public void enrollCourse() {
		System.out.println(this.name + ": enrolled in course");
	}

	@Override
	public void dropCourse() {
		System.out.println(this.name + ": dropped from course");
	}
	
	public double calculateGPA() {
		return (grade/100)*4;
	}

	@Override
	public void printDetails() {
		System.out.println(
				"Student name: " + this.name + ", email: " + this.email + ", id: " + this.id + ", grade: " + grade);
	}

}
