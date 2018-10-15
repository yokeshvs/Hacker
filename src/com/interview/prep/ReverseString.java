package com.interview.prep;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("A man a plan a canal: Panama"));
	}
	
	public static String reverseString(String s) {
        if(s.length()==0) return "";
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length()-1;
        System.out.println(i<j);
        while(i<=j && i<sb.length()){
            char x = sb.charAt(i);
            System.out.println(x);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,x);
            i++;j--;
        }
        return sb.toString();
    }
}
