package com.interview.prep;

import java.util.ArrayList;
import java.util.List;

public class TwitterCountMatches {
	static boolean uncommonFlag = false;

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		List<String> b = new ArrayList<>();
		a.add("1001");
		a.add("0001");
		a.add("0111");
		a.add("0000");

		b.add("1001");
		b.add("0001");
		b.add("0101");
		b.add("0000");

		System.out.println(countMatches(a, b));
	}

	public static int countMatches(List<String> grid1, List<String> grid2) {
		int n = grid1.size();
		int result = 0;
		int[][] resultGrid = new int[n][n];
		boolean[][] visited = new boolean[n][n];
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				visited[i][j] = false;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				resultGrid[i][j] = Character.getNumericValue(grid1.get(i).charAt(j))
						+ Character.getNumericValue(grid2.get(i).charAt(j));
			}
		}

		for (int i = 0; i < resultGrid.length; i++) {
			for (int j = 0; j < resultGrid[0].length; j++) {
				System.out.print(resultGrid[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (resultGrid[i][j] == 2 && !visited[i][j]) {
					markCurrentRegion(resultGrid, visited, i, j);
					System.out.println("s");
					if(!uncommonFlag) {
						result++;
					}
					uncommonFlag = false;
				}
			}
		}
		return result;
	}

	public static void markCurrentRegion(int[][] resultGrid, boolean[][] visited, int i, int j) {
		visited[i][j] = true;
		if (resultGrid[i][j] == 1) {
			uncommonFlag = true;
		} else if (resultGrid[i][j] == 0) {
			return;
		}

		if (i - 1 >= 0 && !visited[i - 1][j]) {
			markCurrentRegion(resultGrid, visited, i - 1, j);
		}
		if (i + 1 < resultGrid.length && !visited[i + 1][j]) {
			markCurrentRegion(resultGrid, visited, i + 1, j);
		}
		if (j - 1 >= 0 && !visited[i][j - 1]) {
			markCurrentRegion(resultGrid, visited, i, j - 1);
		}
		if (j + 1 < resultGrid[0].length && !visited[i][j + 1]) {
			markCurrentRegion(resultGrid, visited, i, j + 1);
		}
	}
}
