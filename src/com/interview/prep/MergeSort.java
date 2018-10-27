package com.interview.prep;

public class MergeSort {
	private static int[] arr = { 10, 40, 5, 100, 20, 50 };

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		mergeSort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("After sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[start + i];
		}

		for (int i = 0; i < n2; i++) {
			rightArray[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = start;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k++] = leftArray[i++];
		}

		while (j < n2) {
			arr[k++] = rightArray[j++];
		}

	}
}
