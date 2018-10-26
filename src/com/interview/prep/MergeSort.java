package com.interview.prep;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 5, 100, 20, 50 };
		int[] result = mergeSort(arr,0,arr.length);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
	
	public static int[] mergeSort(int[] arr, int start, int end) {
		int mid = end/2;
		int[] l1 = mergeSort(arr, start, mid-1);
		int[] l2 = mergeSort(arr, mid, end);
		return new int[0];
	}
}
