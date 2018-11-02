package com.interview.important;

public class Node {
	private Node left;
	private Node right;
	private Integer val;
	private Boolean visited;

	public Node(Integer val) {
		this.val = val;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public Boolean getVisited() {
		return visited;
	}

	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	public static Node generateBinaryTree() {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);
		Node g = new Node(70);
		Node h = new Node(80);

		d.left = b;
		b.left = a;
		b.right = c;
		d.right = g;
		g.left = e;
		e.right = f;
		g.right = h;

		a.visited = false;
		b.visited = false;
		c.visited = false;
		d.visited = false;
		e.visited = false;
		f.visited = false;
		g.visited = false;
		h.visited = false;

		return d;
	}
}
