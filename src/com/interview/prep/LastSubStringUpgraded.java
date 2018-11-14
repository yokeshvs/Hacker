package com.interview.prep;

public class LastSubStringUpgraded {
	public static void main(String[] args) {
		String s = "azabczbcdzdeddzdede";
		int stringLength = s.length();
		int maxIndex = 0;
		int i = 1;
		while (i < stringLength) {
			if (s.charAt(i) > s.charAt(maxIndex)) {
				maxIndex = i;
				i++;
			} else if (s.charAt(i) == s.charAt(maxIndex)) {
				int j = i + 1;
				int k = maxIndex + 1;
				while (j < stringLength && k < i) {
					if (s.charAt(j) > s.charAt(k)) {
						maxIndex = i;
						break;
					} else if (s.charAt(j) == s.charAt(k)) {
						j++;
						k++;
					} else {
						break;
					}
				}
				i++;
			} else {
				i++;
			}
		}

		System.out.println(s.substring(maxIndex));
	}
}
