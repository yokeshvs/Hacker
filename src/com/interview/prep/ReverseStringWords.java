package com.interview.prep;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i like  me";
		String[] arr = s.split("\\s+");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = arr.length-1; i >= 0; i--) {
			stringBuilder.append(arr[i] + ".");
		}
		System.out.println(stringBuilder.toString());
		
	}

}
