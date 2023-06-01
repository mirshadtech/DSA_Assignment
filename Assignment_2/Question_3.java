package in.ineuron;

import java.util.HashMap;

/*'
 * 	We define a harmonious array as an array where the difference between its maximum value
 	and its minimum value is exactly 1.
	Given an integer array nums, return the length of its longest harmonious subsequence
	among all its possible subsequences.
	A subsequence of an array is a sequence that can be derived from the array by deleting some
	or no elements without changing the order of the remaining elements.
	Example 1:
	Input: nums = [1,3,2,2,5,2,3,7]
	Output: 5
	Explanation: The longest harmonious subsequence is [3,2,2,2,3].*/


public class Question_3 {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 3, 2, 2, 5, 2, 3, 7 };
		int res = findLHS(nums);

		System.out.println("Result is " + res);
	}

	static int findLHS(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			if ((map.containsKey(nums[i] + 1))) {
				sum = map.get(nums[i]) + map.get(nums[i] + 1);
			}
			if (sum > max)
				max = sum;
		}
		return max;
	}
}
