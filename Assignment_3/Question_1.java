package in.ineuron;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2

Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/
public class Question_1 {

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 3, 4, 5, -1, -1, 2, 1 };
		int target = 2;
		int res = threeSum(nums, target);

		System.out.println("Result is " + res);
	}

	static int threeSum(int[] nums, int target) {

		Arrays.sort(nums);
		int ans = 0;
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int p1 = i + 1;
			int p2 = nums.length - 1;
			while (p1 < p2) {

				int sum = nums[i] + nums[p1] + nums[p2];
				if (sum == target) {
					return sum;
				} else if (Math.abs(sum - target) < diff) {
					diff = Math.abs(sum - target);
					ans = sum;
				}

				if (sum < target)
					p1++;
				else
					p2--;
			}
		}

		return ans;
	}

}
