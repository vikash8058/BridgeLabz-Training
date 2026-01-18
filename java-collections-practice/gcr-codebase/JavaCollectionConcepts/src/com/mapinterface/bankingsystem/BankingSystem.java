package com.mapinterface.bankingsystem;

import java.util.*;

class BankingSystem {

	// stores account number and balance
	Map<Integer, Integer> accounts = new HashMap<>();

	// queue for withdrawal requests
	Queue<Integer> withdrawalQueue = new LinkedList<>();

	// add new account
	void addAccount(int accNo, int balance) {
		accounts.put(accNo, balance);
	}

	// request withdrawal
	void requestWithdrawal(int accNo) {
		withdrawalQueue.add(accNo);
	}

	// process withdrawal requests
	void processWithdrawals(int amount) {

		while (!withdrawalQueue.isEmpty()) {
			int accNo = withdrawalQueue.remove();

			int balance = accounts.get(accNo);

			if (balance >= amount) {
				accounts.put(accNo, balance - amount);
				System.out.println("Withdrawal successful for " + accNo);
			} else {
				System.out.println("Insufficient balance for " + accNo);
			}
		}
	}

	// display accounts sorted by balance
	void displaySortedByBalance() {

		TreeMap<Integer, List<Integer>> sorted = new TreeMap<>();

		for (int accNo : accounts.keySet()) {
			int balance = accounts.get(accNo);
			sorted.computeIfAbsent(balance, k -> new ArrayList<>()).add(accNo);
		}

		for (int balance : sorted.keySet()) {
			for (int accNo : sorted.get(balance)) {
				System.out.println(accNo + " -> " + balance);
			}
		}
	}
}
