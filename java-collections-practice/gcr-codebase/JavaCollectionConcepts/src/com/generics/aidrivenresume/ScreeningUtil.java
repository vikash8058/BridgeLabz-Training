package com.generics.aidrivenresume;

import java.util.*;

class ScreeningUtil {

	// handles resumes of any job role
	static void screenResumes(List<? extends JobRole> roles) {

		for (JobRole role : roles) {
			System.out.println("Screening for " + role.roleName + " | Required Skills: " + role.requiredSkills());
		}
	}
}
