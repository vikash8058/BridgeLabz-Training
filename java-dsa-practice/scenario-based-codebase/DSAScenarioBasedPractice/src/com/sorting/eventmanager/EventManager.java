package com.sorting.eventmanager;

public class EventManager {

	// quicksort-logic
	public void quickSort(Ticket[] array, int low, int high) {
		if (low < high) {
			int pivotIdx = partition(array, low, high);
			quickSort(array, low, pivotIdx - 1);
			quickSort(array, pivotIdx + 1, high);
		}
	}

	// helper method of quickSort
	public int partition(Ticket[] array, int low, int high) {
		int pivot = array[high].getPrice();
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j].getPrice() < pivot) {
				i++;

				// swap tickets
				Ticket temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		Ticket temp = array[i];
		array[i] = array[high];
		array[high] = temp;

		return i;
	}

	// display tickets
	public static void display(Ticket[] arr) {
		for (Ticket t : arr) {
			System.out.println(t);
		}
	}
}
