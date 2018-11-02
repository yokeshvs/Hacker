package com.interview.important;

import java.util.Stack;

public class DFSTraversal {
	public static void main(String[] args) {
		Node root = Node.generateBinaryTree();
		dfsStack(root);
	}

	public static void dfs(Node node) {
		if (node == null)
			return;
		if (node.getVisited())
			return;
		System.out.println(node.getVal());
		node.setVisited(true);
		dfs(node.getLeft());
		dfs(node.getRight());
	}

	public static void dfsStack(Node node) {
		Stack<Node> nodes = new Stack<>();
		nodes.add(node);
		while (!nodes.isEmpty()) {
			Node current = nodes.pop();
			if (current != null && !current.getVisited()) {
				System.out.println(current.getVal());
				current.setVisited(true);
				nodes.push(current.getRight());
				nodes.push(current.getLeft());
			}
		}
	}
}
