package com.interview.prep;

public class BinaryCount {
	public static void main(String[] args) {
		int[] nums = {0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		if(nums.length == 1 && nums[0] == 1) return 1;
        int count = 0;
        int result = 0;
        for(int i=0; i<nums.length; i++){
        	System.out.println("s" + nums[i]);
            if(1 == nums[i]){
            	System.out.println("ss");
                count++;
            }else{
            	System.out.println(count);
            	result = result<count? count:result;
                count=0;
            }
            
        }
        return result<count? count:result;
    }
}
