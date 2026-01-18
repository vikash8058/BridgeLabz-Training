package com.generics.multileveluniversity;

abstract class CourseType {

	String evaluation;

	CourseType(String evaluation) {
		this.evaluation = evaluation;
	}

	abstract String getType();
}
