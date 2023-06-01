package in.ineuron;

/**
 * Question 4
Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2*/
public class Question_4 {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 3, 4, 6 };
		int target = 5;
		int res = searchInsert(nums, target);
		System.out.println("Result is " + res);
	}

	static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int res = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				res = mid;
				break;
			} else if (nums[mid] > target)
				high = mid - 1;
			else if (nums[mid] < target)
				low = mid + 1;
		}

		if (res == -1)
			return low;

		else
			return res;
	}

}
