package com.personalizedlearningplatform;

import java.util.List;

public class Quiz {

	private List<String> questions; // list of questions
	private final List<String> correctAnswers; // list of correct answers
	private int score;
	private String difficulty;

	public Quiz(List<String> questions, List<String> correctAnswers, String difficulty) {
		this.questions = questions;
		this.correctAnswers = correctAnswers;
		this.difficulty = difficulty;
		this.score = 0;
	}

	public void evaluate(List<String> userAnswers) {
		for (int i = 0; i < correctAnswers.size(); i++) {
			if (correctAnswers.get(i).equalsIgnoreCase(userAnswers.get(i))) {
				score++;
			}
		}
	}

	//method to calculate percentage
	public double calcualatePercentage() {
		return ((double) score / correctAnswers.size()) * 100;
	}

	//method to find out the difficulty of questions
	public String getDifficulty() {
		return difficulty;
	}
}
