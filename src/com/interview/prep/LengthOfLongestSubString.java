package com.interview.prep;

import java.util.HashSet;
import java.util.Set;
public class LengthOfLongestSubString {

	public static void main(String[] args) {
		System.out.println("LengthOfLongestSubString: " + lengthOfLongestSubstring("dvdf"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        if(s==null) return 0;
        if(s.length()==0 || s.length()==1) return s.length();
        int maxLength = 0;
        Set<Character> tracker = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
        	System.out.println("Before: "+tracker.toString());
            if(tracker.contains(s.charAt(i))){
                tracker = new HashSet<>();
            }
            tracker.add(s.charAt(i));
            System.out.println("After: "+tracker.toString());
            maxLength = maxLength>tracker.size()?maxLength:tracker.size();
            System.out.println("maxLength: "+maxLength);
        }
        return maxLength;
    }

}
