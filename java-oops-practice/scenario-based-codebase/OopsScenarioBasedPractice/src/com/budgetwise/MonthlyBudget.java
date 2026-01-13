package com.budgetwise;

public class MonthlyBudget extends Budget implements IAnalyzable {

	public MonthlyBudget(double income, double limit) {
		super(income, limit);
	}

	@Override
	public void generateReport() {
		System.out.println("---- Monthly Budget Report ----");
		System.out.println("Income: " + income);
		System.out.println("Total Expenses: " + calculateTotalExpenses());
		System.out.println("Net Savings: " + calculateNetSavings());
	}

	@Override
	public void detectOverspend() {
		System.out.println("Overspending Check (Monthly):");

		for (String category : categoryLimits.keySet()) {
			double spent = 0;

			for (Transaction t : getTransactions()) {
				if (t.getCategory().equalsIgnoreCase(category) && t.getType().equalsIgnoreCase("EXPENSE")) {
					spent += t.getAmount();
				}
			}

			if (spent > categoryLimits.get(category)) {
				System.out.println("Overspent in " + category);
			}
		}
	}
}
