package com.interview.prep;

public class FibonacciSeries {

	public static void main(String[] args) {
		getSeries(5,1,0);
	}
	
	public static void getSeries(int n, int sum, int prevSum) {
		System.out.println(sum+prevSum);
		if(n>1) {
			getSeries(n-1,sum+prevSum, sum);
		}
	}
}
