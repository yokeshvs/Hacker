package com.interview.prep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumLengthEncoding {
	public static void main(String[] args) {
		System.out.println(minimumLengthEncoding(new String[] { "me", "time" }));
	}

	public static int minimumLengthEncoding(String[] words) {
		Set<String> good = new HashSet(Arrays.asList(words));
		for (String word : words) {
			for (int k = 1; k < word.length(); ++k) {
				System.out.println("sss: " + word.substring(k));
				good.remove(word.substring(k));
				System.out.println("ggg: " + good.toString());
			}
			System.out.println("second");
		}

		int ans = 0;
		for (String word : good)
			ans += word.length() + 1;
		return ans;
	}
}
