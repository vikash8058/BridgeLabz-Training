package com.sorting.zipzimart;

public class ZipZipMartManager {

	// merge sort logic
	// method to divide the array
	public void divide(SalesTransaction[] array, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;

		divide(array, si, mid);
		divide(array, mid + 1, ei);
		conquer(array, si, mid, ei);
	}

	// method to conquer the list
	public void conquer(SalesTransaction[] array, int si, int mid, int ei) {
		SalesTransaction[] merged = new SalesTransaction[ei - si + 1];
		int idx1 = si, idx2 = mid + 1, x = 0;

		while (idx1 <= mid && idx2 <= ei) {
			if (array[idx1].getAmount() <= array[idx2].getAmount()) {
				merged[x++] = array[idx1++];
			} else {
				merged[x++] = array[idx2++];
			}
		}

		while (idx1 <= mid) {
			merged[x++] = array[idx1++];
		}

		while (idx2 <= ei) {
			merged[x++] = array[idx2++];
		}

		for (int i = 0, j = si; i < merged.length; i++, j++) {
			array[j] = merged[i];
		}
	}

	// method to display the transactions
	public void displayTransactions(SalesTransaction[] array) {
		for (SalesTransaction transaction : array) {
			System.out.println(transaction);
		}
	}
}
