package com.interview.amazon;

import java.util.*;

public class SecondHalfLinkedList {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list.size()/2);
		System.out.println(list.get(2));
	}
}
