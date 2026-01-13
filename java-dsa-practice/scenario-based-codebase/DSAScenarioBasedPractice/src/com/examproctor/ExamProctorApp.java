package com.examproctor;

public class ExamProctorApp {
	public static void main(String[] args) {
		ExamProctor proctor = new ExamProctor();

		proctor.visitQuestion(1);
		proctor.submitAnswer(1, "A");

		proctor.visitQuestion(2);
		proctor.submitAnswer(2, "C");

		proctor.visitQuestion(3);
		proctor.submitAnswer(3, "B");

		proctor.goBack();

		proctor.visitQuestion(4);
		proctor.submitAnswer(4, "D");

		proctor.evaluateExam();
	}
}
