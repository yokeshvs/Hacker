package com.interview.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		
		//conversions
		
		//Set
		Set<Integer> aSet = Arrays.stream(a).collect(Collectors.toSet());
		System.out.println(aSet);
		
		int[] b = {6,7,8,9,10};
		Set<Integer> bSet = new HashSet<>();
		for (int i = 0; i < b.length; i++) {
			bSet.add(b[i]);
		}
		System.out.println(bSet);
		
		//List
		System.out.println("List");
		List<Integer> aList = Arrays.asList(a);
		System.out.println(aList);
		
		List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
		System.out.println(bList);
		
		//Map
		System.out.println("Map");
		Map<Integer, Integer> aMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			aMap.put(i, a[i]);
		}
		System.out.println(aMap);
		
	}
}
