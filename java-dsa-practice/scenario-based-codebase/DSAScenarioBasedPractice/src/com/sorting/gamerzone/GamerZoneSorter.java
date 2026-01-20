package com.sorting.gamerzone;

public class GamerZoneSorter {

	public int partition(Player[] arr, int low, int high) {

		int pivot = arr[high].getScore();
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j].getScore() > pivot) {
				i++;
				Player temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		Player temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		return i;
	}

	public void quickSort(Player[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	public void display(Player[] players) {
		for (Player p : players) {
			System.out.println(p);
		}
	}
}
