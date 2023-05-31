package in.ineuron;

import java.util.HashSet;
/*<aside>
💡 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true

</aside>
 * */

public class Question_6 {

	public static void main(String[] args) {

		int[] nums=new int[] {1,1,1,3,3,4,3,2,4,2};
		System.out.println(" Result IS " +containsDuplicate(nums));
	}

	static boolean containsDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i]))
				return true;
			else
				set.add(nums[i]);
		}
		return false;
	}

}
