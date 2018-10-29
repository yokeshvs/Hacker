package com.interview.prep;


public class SecondLargestElementInBST {
	public static void main(String[] args) {
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
		
		System.out.println(getSecondLargest(d, 0));
	}
	
	public static Integer getSecondLargest(Node root, Integer height) {
		if(root == null) return 0;
		if(height == 2) return root.x;
		return 0;
	}
}
