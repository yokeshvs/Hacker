package com.interview.prep;

public class TwoDMatrixRotation {
	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 2, 3 }, { 3, 2, 1, 0 }, { 3, 5, 6, 1 }, { 3, 8, 3, 4 } };
		int[][] arr2 = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
				arr2[j][i] = arr[i][j];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr2[i][j]);
			}
		}
	}
}
