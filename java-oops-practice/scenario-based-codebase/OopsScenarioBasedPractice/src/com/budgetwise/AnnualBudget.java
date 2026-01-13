package com.budgetwise;

public class AnnualBudget extends Budget implements IAnalyzable {

	public AnnualBudget(double income, double limit) {
		super(income, limit);
	}

	@Override
	public void generateReport() {
		System.out.println("==== Annual Budget Summary ====");
		System.out.println("Yearly Income: " + income);
		System.out.println("Yearly Expenses: " + calculateTotalExpenses());
		System.out.println("Yearly Savings: " + calculateNetSavings());
	}

	@Override
	public void detectOverspend() {
		System.out.println("Overspending Check (Annual):");

		if (calculateTotalExpenses() > limit) {
			System.out.println("Overall yearly budget exceeded!");
		}
	}
}
