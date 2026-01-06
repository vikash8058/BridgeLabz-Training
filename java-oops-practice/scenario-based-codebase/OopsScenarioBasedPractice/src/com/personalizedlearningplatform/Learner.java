package com.personalizedlearningplatform;

public class Learner extends User implements ICertifiable {

	private String courseType;
	private double percentage;

	public Learner(String name, String email, int userId, String courseType) {
		super(name, email, userId);
		this.courseType = courseType;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public void generateCertificate() {
		if (courseType.equalsIgnoreCase("short")) {
			System.out.println("Short Course Certificate awarded to " + name + " | Score: " + percentage + "%");
		} else if (courseType.equalsIgnoreCase("full-time")) {
			System.out.println("Full-Time Course Certificate awarded to " + name + " | Score: " + percentage + "%");
		}
	}
}
