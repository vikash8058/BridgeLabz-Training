package com.sorting.zipzimart;

public class ZipZipMartApp {
	public static void main(String[] args) {
		
		ZipZipMartManager manager=new ZipZipMartManager();
		SalesTransaction[] transactions= {
				new SalesTransaction("2026-02-10", 500),
				new SalesTransaction("2026-02-10", 300),
				new SalesTransaction("2026-02-09", 700),
				new SalesTransaction("2026-02-11", 300),
				new SalesTransaction("2026-02-09", 500)
		};
		
		System.out.println("Before Sorting:");
		manager.displayTransactions(transactions);

		manager.divide(transactions, 0, transactions.length - 1);

		System.out.println("\nAfter Sorting by Amount (Stable):");
		manager.displayTransactions(transactions);
	}
}
