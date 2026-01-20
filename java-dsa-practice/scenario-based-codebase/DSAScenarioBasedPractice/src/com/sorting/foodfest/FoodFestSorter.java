package com.sorting.foodfest;

public class FoodFestSorter {

	public void divide(Stall[] arr, int si, int ei) {
		if (si >= ei) return;

		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public void conquer(Stall[] arr, int si, int mid, int ei) {

		Stall[] merged = new Stall[ei - si + 1];
		int i = si, j = mid + 1, x = 0;

		while (i <= mid && j <= ei) {
			if (arr[i].getFootfall() >= arr[j].getFootfall()) {
				merged[x++] = arr[i++];
			} else {
				merged[x++] = arr[j++];
			}
		}

		while (i <= mid) merged[x++] = arr[i++];
		while (j <= ei) merged[x++] = arr[j++];

		for (int k = 0; k < merged.length; k++) {
			arr[si + k] = merged[k];
		}
	}

	public void display(Stall[] stalls) {
		for (Stall s : stalls) {
			System.out.println(s);
		}
	}
}
