package com.interview.bitmanipulation;

public class FindDifference {
	public static void main(String[] args) {
		System.out.println(110&110);
		System.out.println("s");
		String a = "abcd";
		String b = "abacd";
		System.out.println(findDifference(a, b));
		System.out.println("sss");
	}

	public static char findDifference(String a, String b) {
		char result = 0;
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		int i = aArray.length;
		int j = bArray.length;
		int k = 0;
		int l = 0;
		while (k < i && l < j) {
			result ^= aArray[k] ^ bArray[l];
			k++;
			l++;
		}
		while (k < i) {
			result ^= aArray[k];
			k++;
		}
		while (l < j) {
			result ^= bArray[l];
			l++;
		}

		return result;
	}
}
