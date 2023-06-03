package in.ineuron;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer array nums of length n where all the integers of nums are in
 * the range [1, n] and each integer appears **once** or **twice**, return *an
 * array of all the integers that appears **twice***.
 * 
 * You must write an algorithm that runs in O(n) time and uses only constant
 * extra space.
 ** 
 * Example 1:**
 ** 
 * Input:** nums = [4,3,2,7,8,2,3,1]
 ** 
 * Output:**
 * 
 * [2,3]
 */
public class Question_6 {

	public static void main(String[] args) {

		int[] nums = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> res = findDuplicates(nums);
		System.out.println(res);
	}

	public static List<Integer> findDuplicates(int[] nums) {

		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			} else
				i++;
		}
		System.out.println(Arrays.toString(nums));
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1)
				list.add(nums[j]);
		}
		return list;
	}
}
