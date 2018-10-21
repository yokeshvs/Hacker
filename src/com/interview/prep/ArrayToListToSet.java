package com.interview.prep;

import java.util.*;

public class ArrayToListToSet {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		Object[] s = a.toArray();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Object[] d = list.toArray();
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		list1.add(list);
		list1.add(list);
		Integer[][] h = new Integer[2][3];
		for (int i = 0; i < list1.size(); i++) {
			h[i] = list1.get(i).toArray(h[i]);
		}
		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h.length; j++) {
				System.out.println(h[i][j]);
				
			}
		}
		
	}
}
