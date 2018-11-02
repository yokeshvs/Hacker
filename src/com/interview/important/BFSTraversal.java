package com.interview.important;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
	public static void main(String[] args) {
		Node root = Node.generateBinaryTree();
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.println(current.getVal());
			if(current.getLeft()!=null) queue.add(current.getLeft());
			if(current.getRight()!=null) queue.add(current.getRight());
		}
	}
}
