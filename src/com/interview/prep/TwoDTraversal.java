package com.interview.prep;

import java.util.LinkedList;
import java.util.Queue;

class QNode {
	int row;
	int column;
	int distance;

	public QNode(int row, int column, int distance) {
		this.row = row;
		this.column = column;
		this.distance = distance;
	}
}

public class TwoDTraversal {
	public static void main(String[] args) {
		char[][] arr = { { '0', '*', '0', 's' }, { '*', '0', '*', '*' }, { '0', '*', '*', '*' },
				{ 'd', '*', '*', '*' } };
		System.out.println("Shortest Distance: " + findShortestPath(arr));
	}
	public static int findShortestPath(char[][] arr) {
		int rowLength = arr.length;
		int columnLength = arr[0].length;
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		Queue<QNode> qNodes = new LinkedList<QNode>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == '0') {
					visited[i][j] = true;
				} else {
					visited[i][j] = false;
				}
				
				if(arr[i][j] == 's') {
					qNodes.add(new QNode(i, j, 0));
					visited[i][j] = true;
				}
			}
		}
		
		while(!qNodes.isEmpty()) {
			QNode node = qNodes.poll();
			if(arr[node.row][node.column] == 'd') {
				return node.distance;
			}
			
			//moving up
			if(node.row-1 >=0 && visited[node.row-1][node.column] == false) {
				qNodes.add(new QNode(node.row-1, node.column, node.distance+1));
				visited[node.row-1][node.column] = true;
			}
			//moving down
			if(node.row+1 < rowLength && visited[node.row+1][node.column] == false) {
				qNodes.add(new QNode(node.row+1, node.column, node.distance+1));
				visited[node.row+1][node.column] = true;
			}
			//moving left
			if(node.column-1 >=0 && visited[node.row][node.column-1] == false) {
				qNodes.add(new QNode(node.row, node.column-1, node.distance+1));
				visited[node.row][node.column-1] = true;
			}
			//moving right
			if(node.column+1 < columnLength && visited[node.row][node.column+1] == false) {
				qNodes.add(new QNode(node.row, node.column+1, node.distance+1));
				visited[node.row][node.column+1] = true;
			}
		}
		return -1;
	}
}
