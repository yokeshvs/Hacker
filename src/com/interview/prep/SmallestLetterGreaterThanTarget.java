package com.interview.prep;

public class SmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'h' };
		int result = 0;
		int target = (int) 'd';
		for (int i = 0; i < letters.length; i++) {
			int charVal = (int) letters[i];
			System.out.println("charVal: " + charVal);
			System.out.println("target: " + target);
			System.out.println("result: " + result);
			System.out.println();
			if (charVal > target && charVal < result) {
				result = charVal;
			} else if (result == 0) {
				result = charVal;
			}
		}
		System.out.println("s");
		System.out.println((char) result);

		char a = 'a';
		char b = 'b';
		System.out.println((int) a);
		System.out.println((int) b);
		System.out.println(a > b);
		
		System.out.println(Math.abs(-1));
		
		System.out.println("a");
		String t = "sabresabre";
		String[] s = t.split("sabre");
		System.out.println(s.length);
		System.out.println("sss");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("substring");
		String ss = "abab";
		String sss = ss+ss;
		System.out.println(sss.substring(1,sss.length()-1));
	}
}
