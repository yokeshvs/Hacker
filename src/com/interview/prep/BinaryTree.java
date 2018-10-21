package com.interview.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
	int x;
	Node left;
	Node right;

	public Node(int val) {
		this.x = val;
	}
}

public class BinaryTree {

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
		
		System.out.println("In order Traversal");
		inOrderTraversal(d);
		
		System.out.println("Pre order Traversal");
		preOrderTraversal(d);
		
		System.out.println("Post order Traversal");
		postOrderTraversal(d);
		
		List<Integer> collection = new ArrayList<>();
		collection.add(0,1);
		List<Integer> collection1 = new ArrayList<>();
		collection1.add(0,10);
		List<List<Integer>> collection2 = new ArrayList<>();
		collection2.add(collection1);
		collection2.add(collection);
		System.out.println(collection2.toString());
		Collections.reverse(collection2);
		System.out.println(collection2.toString());
	}

	public static void inOrderTraversal(Node x) {
		if(null == x) return;
		
		if(x.left != null) inOrderTraversal(x.left);
		
		System.out.println(x.x);
		
		if(x.right != null) inOrderTraversal(x.right);
		
	}
	
	public static void preOrderTraversal(Node x) {
		if(null == x) return;
		
		System.out.println(x.x);
		
		if(x.left != null) preOrderTraversal(x.left);
		
		if(x.right != null) preOrderTraversal(x.right);
		
	}
	
	public static void postOrderTraversal(Node x) {
		if(null == x) return;
		
		if(x.left != null) postOrderTraversal(x.left);
		
		if(x.right != null) postOrderTraversal(x.right);
		
		System.out.println(x.x);
		
	}
}
