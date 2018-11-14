package com.interview.prep;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "I am Vivek";
		String[] sArr = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = sArr.length - 1; i > 0 ; i--) {
			sb.append(sArr[i] + " ");
		}
		sb.append(sArr[0]);
		System.out.println(sb.toString());
	}
}
