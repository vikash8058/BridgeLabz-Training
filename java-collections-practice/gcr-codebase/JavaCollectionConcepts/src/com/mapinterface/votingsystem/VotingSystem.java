package com.mapinterface.votingsystem;

import java.util.*;

class VotingSystem {

	// stores votes for quick update
	Map<String, Integer> voteMap = new HashMap<>();

	// maintains order of votes cast
	Map<String, Integer> voteOrder = new LinkedHashMap<>();

	// cast a vote
	void vote(String candidate) {

		voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
		voteOrder.put(candidate, voteMap.get(candidate));
	}

	// display votes in insertion order
	void displayVoteOrder() {

		for (String key : voteOrder.keySet()) {
			System.out.println(key + " -> " + voteOrder.get(key));
		}
	}

	// display result in sorted order
	void displaySortedResult() {

		TreeMap<String, Integer> sorted = new TreeMap<>(voteMap);

		for (String key : sorted.keySet()) {
			System.out.println(key + " -> " + sorted.get(key));
		}
	}
}
