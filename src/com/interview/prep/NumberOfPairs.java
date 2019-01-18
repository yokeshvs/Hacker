package com.interview.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NumberOfPairs {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
//		System.out.println(getPairs(a, 3));
		
		Map<String, String> map = new HashMap<>();
		map.put("a", "1");
		map.put("c", "3");
		map.put("b", "2");
		ArrayList<String> b = new ArrayList<>();
		b.add("a");
		b.add("c");
		b.add("b");
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		for (String string : b) {
			System.out.println(string);
			if(b.contains("a")) {
				
			}
		}
	}
	
	public static int getPairs(int[] a, long k) {
		int result = 0;
		Set<Long> tracker = new HashSet<>();
		for (int current : a) {
			if(tracker.contains(k-current)) {
				result++;
				tracker.remove(k-current);
			}else {
				tracker.add((long)current);
			}
		}
		return result;
	}
}
