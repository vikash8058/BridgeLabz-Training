package com.university;

//Enrollment class connecting student and course
public class Enrollment {

	private Student student;
	private Course course;

	public Enrollment(Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	public void enroll() {
		System.out.println("Enrollment Successful");
		System.out.println(course.getCourseDetails());
	}
}
