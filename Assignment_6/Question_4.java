package in.ineuron;

import java.util.HashMap;

/**
 * <aside> 💡 **Question 4**
 * 
 * Given a binary array nums, return *the maximum length of a contiguous
 * subarray with an equal number of* 0 *and* 1.
 ** 
 * Example 1:**
 ** 
 * Input:** nums = [0,1]
 ** 
 * Output:** 2
 ** 
 * Explanation:**
 * 
 * [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 * 
 * </aside>
 */
public class Question_4 {

	public static void main(String[] args) {

		int[] nums = new int[] {0,1,0,1,0,1,1,0,0,1};
		int res = findMaxLength(nums);
		System.out.println("Result is " + res);
	}

	static int findMaxLength(int nums[]) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				nums[i] = -1;
		}

		int sum = 0;
		int len = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum == 0)
				len = Math.max(len, i + 1);

			if (map.containsKey(sum)) {
				len = Math.max(len, i - map.get(sum));
			} else
				map.put(sum, i);
		}

		return len;
	}

}
