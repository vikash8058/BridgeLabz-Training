package com.budgetwise;

public class BudgetWiseApp {

	public static void main(String[] args) {

		IAnalyzable monthly = new MonthlyBudget(50000, 40000);

		((MonthlyBudget) monthly).addCategoryLimit("Food", 10000);
		((MonthlyBudget) monthly).addCategoryLimit("Travel", 8000);

		((MonthlyBudget) monthly).addTransaction(new Transaction(3000, "EXPENSE", "05-01-2026", "Food"));

		((MonthlyBudget) monthly).addTransaction(new Transaction(9000, "EXPENSE", "10-01-2026", "Travel"));

		monthly.generateReport();
		monthly.detectOverspend();

		System.out.println();

		IAnalyzable annual = new AnnualBudget(600000, 500000);

		((AnnualBudget) annual).addTransaction(new Transaction(520000, "EXPENSE", "2026", "Overall"));

		annual.generateReport();
		annual.detectOverspend();
	}
}
