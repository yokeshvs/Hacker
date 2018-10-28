package com.interview.prep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePractice {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.contains(2));
		
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		System.out.println("Stack");
		System.out.println(stack);
		System.out.println(stack.push(10));
		System.out.println(stack);
		stack.pop();
		System.out.println(stack.lastElement());
		System.out.println(stack);
		
		
	}

}
