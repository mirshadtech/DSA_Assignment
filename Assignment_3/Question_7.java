package in.ineuron;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given an inclusive range [lower, upper] and a sorted unique integer
 * array nums, where all elements are within the inclusive range.
 * 
 * A number x is considered missing if x is in the range [lower, upper] and x is
 * not in nums.
 * 
 * Return the shortest sorted list of ranges that exactly covers all the missing
 * numbers. That is, no element of nums is included in any of the ranges, and
 * each missing number is covered by one of the ranges.
 * 
 * Example 1: Input: nums = [0,1,3,50,75], lower = 0, upper = 99 Output:
 * [[2,2],[4,49],[51,74],[76,99]]
 * 
 * Explanation: The ranges are: [2,2] [4,49] [51,74] [76,99]
 */
public class Question_7 {

	public static void main(String[] args) {

		int[] nums = new int[] { 0, 1, 3, 50, 75 };

		int lower = 0;
		int upper = 99;
		List<int[]> res = findShortestList(nums, lower, upper);

		res.forEach(n1 -> {
			System.out.print(Arrays.toString(n1));
		});

	}

	static List<int[]> findShortestList(int[] nums, int lower, int upper) {
		LinkedList<int[]> list = new LinkedList<int[]>();

		for (int i = lower, j = 0; i <= upper; i++) {
			if (j < nums.length && nums[j] == i) {
				j++;
			} else {
				if (j < nums.length) {
					int[] res = new int[2];
					res[0] = i;
					res[1] = nums[j] - 1;
					list.add(res);
					i = nums[j];
					j++;
				} else {
					int[] res = new int[2];
					res[0] = i;
					res[1] = upper;
					list.add(res);
					break;
				}

			}

		}
		return list;
	}

}
