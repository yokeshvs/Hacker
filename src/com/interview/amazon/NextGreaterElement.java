package com.interview.amazon;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = {13,7,6,12};
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean isUpdated = false;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					result[i] = arr[j];
					isUpdated = true;
					break;
				}
			}
			if(!isUpdated) {
				result[i] = -1;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
