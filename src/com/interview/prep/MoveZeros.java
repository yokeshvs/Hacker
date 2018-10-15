package com.interview.prep;

public class MoveZeros {
	public static void main(String[] args) {
		int[]nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int count = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]!=0){
                count++;
            }else{
            	System.out.println("count: "+count + " i: "+i);
                for(int j=i; j<i+count; j++){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
