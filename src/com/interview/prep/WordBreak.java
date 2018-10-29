package com.interview.prep;

import java.util.Arrays;
import java.util.List;

class Trie {
	int charSize = 26;
	boolean exist;
	Trie[] next;

	public Trie() {
		next = new Trie[charSize];
		exist = false;
	}
}

public class WordBreak {
	public static void main(String[] args) {

		String s = "leetcode";
		System.out.println((int) 'z' - 'a');

		// List of Strings to represent dictionary
		List<String> dict = Arrays.asList("this","leet","code", "th", "is", "famous", "word", "break", "b", "r", "e", "a", "k", "br",
				"bre", "brea", "ak", "prob", "lem");
//		System.out.println(wordBreak(s, dict));

		Trie root = new Trie();
		for (int i = 0; i < dict.size(); i++) {
			insertTrie(root, dict.get(i));
		}
		System.out.println(wordBreak(root, s));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		int len = s.length();
		boolean[] f = new boolean[len + 1];
		f[0] = true;
		for (int i = 1; i < len + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("s.substring(j, i): " + s.substring(j, i));
				if (f[j] && wordDict.contains(s.substring(j, i))) {
					f[i] = true;
					break;
				}
			}
		}
		return f[len];
	}

	public static void insertTrie(Trie root, String text) {
		int len = text.length();
		Trie trie = root;
		for (int i = 0; i < len; i++) {
			if (trie.next[text.charAt(i) - 'a'] == null) {
				trie.next[text.charAt(i) - 'a'] = new Trie();
			}
			trie = trie.next[text.charAt(i) - 'a'];
		}
		trie.exist = true;
	}

	public static boolean wordBreak(Trie root, String text) {
		boolean[] textChecker = new boolean[text.length() + 1];
		textChecker[0] = true;
		for (int i = 0; i < text.length(); i++) {
			if (textChecker[i]) {
				Trie trie = root;
				for (int j = i; j < text.length(); j++) {
					if (trie == null)
						break;
					trie = trie.next[text.charAt(j) - 'a'];
					if (trie != null && trie.exist) {
						textChecker[j + 1] = true;
					}
				}
			}
		}
		return textChecker[text.length()];
	}
}
