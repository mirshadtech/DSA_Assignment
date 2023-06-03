package in.ineuron;

import java.util.Arrays;

/**
 * <aside> 💡 **Question 7**
 * 
 * Suppose an array of length n sorted in ascending order is **rotated** between
 * 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 * 
 * - [4,5,6,7,0,1,2] if it was rotated 4 times. - [0,1,2,4,5,6,7] if it was
 * rotated 7 times.
 * 
 * Notice that **rotating** an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
 * results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * 
 * Given the sorted rotated array nums of **unique** elements, return *the
 * minimum element of this array*.
 * 
 * You must write an algorithm that runs in O(log n) time.
 ** 
 * Example 1:**
 ** 
 * Input:** nums = [3,4,5,1,2]
 ** 
 * Output:** 1
 ** 
 * Explanation:**
 * 
 * The original array was [1,2,3,4,5] rotated 3 times.
 * 
 * </aside>
 */

public class Question_7 {

	public static void main(String[] args) {

		int k = 3;
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		rotate(nums, k);

		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {

		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	private static void reverse(int[] nums, int start, int end) {

		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
