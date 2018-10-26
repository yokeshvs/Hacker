package com.interview.prep;

public class IntegerDigitSum {

	public static void main(String[] args) {
		int[] A = { 1, 0, 0, 0 };
		int[] B = { 3, 4, 5, 2 };
		int[] sum = A.length > B.length ? sumOfIntegerDigits(A, B) : sumOfIntegerDigits(B, A);
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		String s = "sss";
		System.out.println(s.split(""));
	}

	public static int[] sumOfIntegerDigits(int[] A, int[] B) {
		int[] sum = new int[A.length];
		int carry = 0;
		for (int i = 0; i < B.length; i++) {
			int result = A[i] + B[i] + carry;
			if(result>9) {
				carry = result/10;
			}
			sum[i] = result%10;
		}
		return new int[1];
		
	}
}
