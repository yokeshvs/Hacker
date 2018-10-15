package com.interview.prep;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		int[] b = a;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		b[0] = 1;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		Integer c = 10;
		Integer d = 20;
		Integer e = c + d;
		System.out.println(e);
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(100);
		f.add(200);
		System.out.println(f.toString());
		System.out.println(f.get(0).toString());
		
		// getter for array and dynamic array
		System.out.println(a[0]);
		System.out.println(f.get(0));
		
		List<Integer> g = f;
		System.out.println(g.toString());
		g.set(0, 500);
		System.out.println(f.toString());
		
		List<Integer> h = new ArrayList<>(f);
		System.out.println(h.toString());
		h.set(0, 1000);
		System.out.println(f.toString());
		System.out.println(h.toString());
	}

}
