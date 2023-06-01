package in.ineuron;

import java.util.Arrays;

/**
 * Given an array of meeting time intervals where intervals[i] = [starti, endi],
 * determine if a person could attend all meetings.
 * 
 * Example 1: Input: intervals = [[0,30],[5,10],[15,20]] Output: false
 * 
 * 
 * /* Given an array of meeting time intervals where intervals[i] = [starti,
 * endi], determine if a person could attend all meetings.
 * 
 * Example 1: Input: intervals = [[0,30],[5,10],[15,20]] Output: false
 */
public class Question_8 {

	public static void main(String[] args) {

		int[][] nums = new int[][] { { 5, 10 }, { 0, 30 }, { 15, 20 } };
		boolean res = meetingPossible(nums);
		System.out.println("Result is " + res);
	}

	static boolean meetingPossible(int[][] nums) {

		Arrays.sort(nums, (n1, n2) -> Integer.compare(n1[0], n2[0]));

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i][1] > nums[i + 1][0] || nums[i][1] > nums[i + 1][1])
				return false;
		}

		return true;
	}

}
