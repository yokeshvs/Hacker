package com.interview.amazon;

public class TrappingRainWater {
	public static void main(String[] args) {
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(trap(height));
	}

	public static int trap(int[] height) {
		int result = 0;
		for (int i = 0; i < height.length; i++) {
			int leftMax = 0;
			int rightMax = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (height[j] > leftMax) {
					leftMax = height[j];
				}
			}
			for (int k = i + 1; k < height.length; k++) {
				if (height[k] > rightMax) {
					rightMax = height[k];
				}
			}
			if (leftMax > height[i] && rightMax > height[i]) {
				result += leftMax > rightMax ? rightMax - height[i] : leftMax - height[i];
			}
		}
		return result;
	}
}
