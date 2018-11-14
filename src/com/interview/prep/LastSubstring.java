package com.interview.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastSubstring {
	public static void main(String[] args) {
//		String a = "yeelllowerwerzqwezwerr";
//		char[] sArray = a.toCharArray();
//		int maxIndex = 0;
//        int maxValue = sArray[0] - 'a';
//        for(int i=0; i<sArray.length; i++){
//            if (sArray[i] - 'a' > maxValue) {
//            	System.out.println(i);
//                maxIndex = i;
//                maxValue =sArray[i] - 'a'; 
//            }
//        }
//        
//        System.out.println(a.substring(maxIndex));
//        
//        System.out.println("sss");
//        System.out.println("abc".compareTo("abb"));
//        
//        String[] s = {"b", "bbc", "ddd", "zzz", "aaa"};
//        Arrays.sort(s);
//        for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
        
        System.out.println(compute("ba"));
	}
	
	public static String compute(String s) {
        char[] sArray = s.toCharArray();
        List<Integer> maxIndexes = new ArrayList<>();
        int maxValue = sArray[0] - 'a';
        maxIndexes.add(0);
        for(int i=1; i<sArray.length; i++){
            int temp = sArray[i] - 'a';
            if (temp > maxValue) {
                maxIndexes.clear();
                maxIndexes.add(i);
                maxValue = temp;
            }else if(temp == maxValue){
                maxValue = temp;
                maxIndexes.add(i);
            }
        }
        String[] resultArray = new String[maxIndexes.size()];
        int j = 0;
        System.out.println(maxIndexes);
        for(int i : maxIndexes){
            resultArray[j] = s.substring(i);
            j++;
        }
        Arrays.sort(resultArray);
        return resultArray.length>0?resultArray[resultArray.length-1]:"";
    }
}
