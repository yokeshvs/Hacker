package com.interview.prep;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i = 100;
		List<Integer> result = new ArrayList<>();
		for (int j = 2; j < i; j++) {
			boolean isPrime = checkPrime(j);
			if(isPrime) {
				result.add(j);
			}
		}
		System.out.println(result.toString());
	}
	
	public static boolean checkPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
}
