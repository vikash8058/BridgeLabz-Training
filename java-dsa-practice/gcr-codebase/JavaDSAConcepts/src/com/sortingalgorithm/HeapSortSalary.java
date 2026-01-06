package com.sortingalgorithm;

import java.util.Scanner;
import java.util.Arrays;

public class HeapSortSalary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of applicants: ");
        int n = input.nextInt();	
        int[] salaries = new int[n];

        System.out.println("Enter the salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = input.nextInt();
        }

        heapSort(salaries);

        // Output
        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
        input.close();
 
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}