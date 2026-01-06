package com.eventease;

// Represents an event organizer
public class User {

	// Sensitive user data is private (encapsulation)
	private String name;
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	// Email is not modifiable directly
	public String getEmail() {
		return email;
	}
}
