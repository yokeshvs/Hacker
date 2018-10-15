package com.interview.prep;

import java.util.*;

public class PascalTriangle {
	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<=numRows; i++){
            List<Integer> resultRow = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0|j==i){
                    resultRow.add(1);   
                }
                else{
                    resultRow.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(resultRow);
        }
        System.out.println(result.toString());
	}
}
