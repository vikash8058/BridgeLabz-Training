package com.mapinterface.votingsystem;

public class VotingMain {

	public static void main(String[] args) {

		VotingSystem system = new VotingSystem();

		system.vote("Vikash");
		system.vote("Vishal");
		system.vote("Vikash");
		system.vote("Vishal");
		system.vote("Virendra");

		System.out.println("---- Vote Order ----");
		system.displayVoteOrder();

		System.out.println("\n---- Sorted Result ----");
		system.displaySortedResult();
	}
}
