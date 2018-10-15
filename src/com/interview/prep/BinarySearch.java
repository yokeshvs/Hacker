package com.interview.prep;

public class BinarySearch {
	
	private static int searchValue(int[] nums, int startIndex, int length, int num) {
		if(length >= startIndex) {
			int mid = startIndex + (length-startIndex)/2;
			if(nums[mid]==num) return mid;
			else if(nums[mid] > num) return searchValue(nums,0,mid-1,num);
			else return searchValue(nums,mid+1,length,num);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The number 8" + " is in: " + searchValue(arr, 0, arr.length-1, 80));
	}
}
