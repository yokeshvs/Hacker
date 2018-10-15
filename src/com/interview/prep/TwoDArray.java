package com.interview.prep;

public class TwoDArray {

	public static void main(String[] args) {
		//Spiral Print
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int k = 0, l = 0;
		int m = matrix.length;
		int n = matrix[0].length;
		while (k < m && l < n) {
			for (int i = l; i < n; i++) {
				System.out.print(" " + matrix[k][i]);
			}
			k++;
			for (int i = k; i < m; i++) {
				System.out.print(" " + matrix[i][n - 1]);
			}
			n--;
			if (k < m) {
				for (int i = n - 1; i >= l; i--) {
					System.out.print(" " + matrix[m - 1][i]);
				}
				m--;
			}
			if (l < n) {
				for (int i = m - 1; i >= k; i--) {
					System.out.print(" " + matrix[i][l]);
				}
				l++;
			}

		}
		//Spiral Print end
	}
}
