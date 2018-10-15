package com.interview.prep;

import java.util.Arrays;

public class ArrayPractice2 {

	public static void main(String[] args) {
		int[] nums = {0,0,2,3};
		int highestNumber = 0;
        int highestIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > highestNumber) {
                highestNumber = nums[i];
                highestIndex = i;
                nums[i] = 0;
            }
        }
        System.out.println(highestNumber);
        System.out.println(highestIndex);
        for (int i : nums) {
			System.out.println(i);
		}
        for(int i = 0; i < nums.length; i++){
        	System.out.println(2*nums[i]);
            if (2*nums[i] > highestNumber) {
                System.out.println("fail");
            }
        }
        System.out.println("true");
	}
	
}
