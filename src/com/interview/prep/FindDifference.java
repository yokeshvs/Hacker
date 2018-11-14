package com.interview.prep;

public class FindDifference {
	public static void main(String[] args) {
		System.out.println(00110000 ^ 01000001);
		System.out.println(findTheDifference("abcd", "abscd"));
	}
	
	public static char findTheDifference(String s, String t) {
		char c = 0;
		System.out.println(Integer.toBinaryString(c));
		for (int i = 0; i < s.length(); ++i) {
			System.out.println(" char: " + s.charAt(i) +  " c: " + Integer.toBinaryString(c));
			c ^= s.charAt(i);
			System.out.println("i: " + i + " char: " + s.charAt(i) +  " c: " + Integer.toBinaryString(c));
		}
		System.out.println("next");
		for (int i = 0; i < t.length(); ++i) {
			c ^= t.charAt(i);
			System.out.println("i: " + i + " c: " + Integer.toBinaryString(c));
		}
		return c;
	}
}
