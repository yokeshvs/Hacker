package com.interview.prep;

public class PeakElement {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(findPeakElement(nums));
	}

	public static int findPeakElement(int[] nums) {
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = (l + r) / 2;
			System.out.println(mid);
			System.out.println("nums[mid] : " + nums[mid] + " nums[mid + 1]: " + nums[mid + 1]);
			if (nums[mid] > nums[mid + 1])
				r = mid;
			else
				l = mid + 1;
		}
		return l;
	}

}
