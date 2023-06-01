package in.ineuron;

import java.util.Arrays;

/*Given an integer array nums, find three numbers whose product is maximum and return the
maximum product.
Example 1:
Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-100,-99,1,2,5,4,3]
*/
public class Question_5 {

	public static void main(String[] args) {

		int[] nums = new int[] { -100, -98, -1, 2, 3, 4 };
		System.out.println("Result is "+maximumProduct(nums));
	}

	static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		Arrays.sort(nums);
		return Math.max((nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]),
				(nums[nums.length - 1] * nums[0] * nums[1]));

	}
}
