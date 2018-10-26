package com.interview.prep;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 5, 100, 20, 50 };
		for (int i = 1; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			System.out.println();
			for (int k = 0; k < arr.length; k++) {
				System.out.print(" " + arr[k]);
			}
			if(!swapped) {
				break;
			}
		}
	}

}
