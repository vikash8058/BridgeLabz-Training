package com.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private Faculty faculty;
	private List<Student> students;

	public Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
		students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
		student.enrollCourse();
	}

	public void removeStudent(Student student) {
		students.remove(student);
		student.dropCourse();
	}

	public void showCourseDetails() {
		System.out.println("\nCourse: " + courseName);
		System.out.println("Faculty: " + faculty.name);
		System.out.println("Enrolled Students:");

		for (Student s : students) {
			System.out.println("- " + s.name);
		}
	}
}
