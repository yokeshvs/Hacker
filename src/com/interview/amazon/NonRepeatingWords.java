package com.interview.amazon;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingWords {
	public static void main(String[] args) {
		String a = "I have a blue pen";
		String b = "I got a red pen";
		String[] s = a.split(" ");
		String[] ss = b.split(" ");
		Set<String> sss = new HashSet<String>();
		for (int i = 0; i < ss.length; i++) {
			sss.add(ss[i]);
		}
		for (int i = 0; i < s.length; i++) {
			sss.add(ss[i]);
		}
		for (String string : sss) {
			System.out.println(string);
		}
	}
}
