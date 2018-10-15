package com.interview.prep;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"fls", "flo"};
		System.out.println("a".substring(0, 0));
		System.out.println(findVal(strs));
	}
	
	public static String findVal(String[] strs) {
		if(strs.length==0) return "";
		if(strs.length==1) return strs[0];
        int matchingIndexCount = 0;
        String shortString =strs[0];
        for(int i=0; i<strs.length; i++){
            shortString = strs[i].length() < shortString.length()? strs[i]:shortString;
        }
        for(int i=1; i<shortString.length(); i++){
            String matchText = shortString.length()==1? shortString.substring(0,1):shortString.substring(0,i);
            for(String s : strs){
            	if(!s.equals(shortString)) {
            		s = s.length()==1? s.substring(0,1):s.substring(0,i);
                    if(!(s).equals(matchText)){
                    	System.out.println("inside");
                    	if (matchingIndexCount == 0) {
    						return "";
    					} else {
    						System.out.println(shortString.substring(0,matchingIndexCount-1));
    						return shortString.substring(0,matchingIndexCount-1);
    					}
                    }	
            	}
            }
            matchingIndexCount++;
        }
        return shortString.substring(0,matchingIndexCount);
	}
}
