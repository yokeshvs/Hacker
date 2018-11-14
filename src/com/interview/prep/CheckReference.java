package com.interview.prep;

public class CheckReference {
	public static void main(String[] args) {
		int[] s = {1,2,3};
		checkString(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		Integer a = 10;
		checkString1(a);
		System.out.println(a);
	}
	
	public static void checkString(int[] s) {
		s[0] = 10;
	}
	
	public static void checkString1(Integer s) {
		s = 100;
	}
}
