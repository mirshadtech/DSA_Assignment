package in.ineuron;

import java.util.Arrays;
import java.util.HashMap;
/*
 * <aside>
💡 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
 due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

</aside>*/
public class Question_8 {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 2, 4 };
		int[] res = findErrorNums(nums);

		System.out.println(Arrays.toString(res));
	}

	static int[] findErrorNums(int[] nums) {

		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else
				map.put(nums[i], 1);
		}

		System.out.println(map);
		for (int i = 1; i <= nums.length; i++) {
			if (map.containsKey(i)) {
				if (map.get(i) == 2)
					res[0] = i;
			} else
				res[1] = i;
		}

		return res;
	}

}
