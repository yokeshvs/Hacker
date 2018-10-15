package com.interview.prep;

import java.util.Arrays;

public class MinSizeSubArray {
	public static void main(String[] args) {
		int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
		int s = 213;
		System.out.println(minSubArrayLen(s, nums));
	}
	public static int minSubArrayLen(int s, int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = nums.length-1;
        int sum=0;
        while(i>=0 && s > sum){
            sum += nums[i];
            System.out.println(nums[i] +" " + sum);
            count++;
            i--;
        }
        return count;
    }
}
