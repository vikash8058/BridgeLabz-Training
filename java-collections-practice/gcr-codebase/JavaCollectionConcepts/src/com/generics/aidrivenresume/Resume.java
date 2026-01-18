package com.generics.aidrivenresume;

class Resume<T extends JobRole> {

	String candidateName;
	T jobRole;

	Resume(String candidateName, T jobRole) {
		this.candidateName = candidateName;
		this.jobRole = jobRole;
	}

	void displayResume() {
		System.out.println(candidateName + " | Role: " + jobRole.roleName + " | Skills: " + jobRole.requiredSkills());
	}
}
