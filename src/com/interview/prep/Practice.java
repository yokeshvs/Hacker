package com.interview.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };

		// conversions

		// Set
		System.out.println("Array to Set");
		Set<Integer> aSet = Arrays.stream(a).collect(Collectors.toSet());
		System.out.println(aSet);

		int[] b = { 6, 7, 8, 9, 10 };
		Set<Integer> bSet = new HashSet<>();
		for (int i = 0; i < b.length; i++) {
			bSet.add(b[i]);
		}
		System.out.println(bSet);

		// List
		System.out.println("Array to List");
		List<Integer> aList = Arrays.asList(a);
		System.out.println(aList);

		List<Integer> aList1 = Stream.of(a).collect(Collectors.toList());
		System.out.println("aList1" + aList1);

		List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
		System.out.println(bList);

		// Map
		System.out.println("Array to Map");
		Map<Integer, Integer> aMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			aMap.put(i, a[i]);
		}
		System.out.println(aMap);

		// Set to List
		System.out.println("Set to List");
		List<Integer> setList = new ArrayList<>();
		setList.addAll(aSet);

		List<Integer> setList1 = aSet.stream().collect(Collectors.toList());
		System.out.println(setList1);

		// List to Set
		Set<Integer> listSet = new HashSet<>(setList);
		System.out.println(listSet);

		Set<Integer> listSet1 = setList.stream().collect(Collectors.toSet());

		// To Array
		System.out.println("To Array");

		// List to array
		Integer[] listArray2 = new Integer[0];
		listArray2 = listSet.toArray(listArray2);
		System.out.println("listArray2");
		Arrays.stream(listArray2).forEach(System.out::println);

		// Java8
		System.out.println("List to Array Java8");
		Integer[] listArray = setList.stream().toArray(Integer[]::new);
		Arrays.stream(listArray).forEach(System.out::println);

		// Set to array
		Integer[] setArray2 = new Integer[0];
		setArray2 = listSet.toArray(setArray2);
		System.out.println("setArray2");
		Arrays.stream(setArray2).forEach(System.out::println);

		// Java8
		System.out.println("Set to Array Java8");
		Integer[] setArray = listSet.stream().toArray(Integer[]::new);
		Arrays.stream(setArray).forEach(System.out::println);

		// Map to array
		Set<Integer> mapSet = aMap.keySet();
		System.out.println(mapSet);
		List<Integer> mapValuesList = new ArrayList<>(aMap.values());
		System.out.println(mapValuesList);
		
		Set<Entry<Integer,Integer>> mapIterator = aMap.entrySet();
		for (Entry<Integer, Integer> entry : mapIterator) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
