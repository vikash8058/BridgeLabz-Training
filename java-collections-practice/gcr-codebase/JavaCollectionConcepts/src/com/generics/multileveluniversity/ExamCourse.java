package com.generics.multileveluniversity;

class ExamCourse extends CourseType {

	ExamCourse() {
		super("Written Exam");
	}

	String getType() {
		return "Exam Based";
	}
}
