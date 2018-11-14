package com.interview.prep;

import com.interview.important.Node;

public class CompareTrees {
	public static void main(String[] args) {
		Node a = Node.generateBinaryTree();
		Node b = Node.generateBinaryTree();
		generateInOrderTraversal(a);
		System.out.println(compareBinaryTree(a, b));
	}

	public static void generateInOrderTraversal(Node root) {
		if (root == null)
			return;
		generateInOrderTraversal(root.getLeft());
		System.out.println(root.getVal());
		generateInOrderTraversal(root.getRight());
	}

	public static boolean compareBinaryTree(Node a, Node b) {
		return false;
	}
}
