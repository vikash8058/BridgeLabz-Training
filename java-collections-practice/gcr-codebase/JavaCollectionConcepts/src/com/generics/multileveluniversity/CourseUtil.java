package com.generics.multileveluniversity;

import java.util.*;

class CourseUtil {

	static void displayAll(List<? extends CourseType> list) {

		for (CourseType c : list) {
			System.out.println(c.getType() + " | " + c.evaluation);
		}
	}
}
