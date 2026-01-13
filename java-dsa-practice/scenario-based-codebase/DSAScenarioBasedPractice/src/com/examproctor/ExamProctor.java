package com.examproctor;

import java.util.HashMap;
import java.util.Stack;

public class ExamProctor {

	// stack to track the question navigation
	private Stack<Integer> navigationStack = new Stack<>();

	// map to store answer:questionId ->answer
	HashMap<Integer, String> answerMap = new HashMap<Integer, String>();

	// map to store correct answer:questionId ->answer
	HashMap<Integer, String> correctAnswerMap = new HashMap<Integer, String>();

	// constructor to initialize correct answers
	public ExamProctor() {
		correctAnswerMap.put(1, "A");
		correctAnswerMap.put(2, "C");
		correctAnswerMap.put(3, "B");
		correctAnswerMap.put(4, "D");
	}

	// navigate to a question
	public void visitQuestion(int questionId) {
		navigationStack.push(questionId);
		System.out.println("Visited Question: " + questionId);
	}

	// answer a question
	public void submitAnswer(int questionId, String answer) {
		answerMap.put(questionId, answer);
		System.out.println("Answered Q" + questionId + ": " + answer);
	}

	// go back to previous question
	public void goBack() {
		if (navigationStack.isEmpty()) {
			System.out.println("No previous question");
			return;
		}

		int lastQuestion = navigationStack.pop();
		System.out.println("Back from question: " + lastQuestion);
	}

	// evaluate exam score
	public void evaluateExam() {
		int score = 0;
		for (int questionId : correctAnswerMap.keySet()) {
			if (answerMap.containsKey(questionId)
					&& answerMap.get(questionId).equals(correctAnswerMap.get(questionId))) {
				score++;
			}
		}
		System.out.println("Final Score: " + score + "/" + correctAnswerMap.size());
	}
}



