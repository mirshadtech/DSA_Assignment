package in.ineuron;

/**
 * Given a non-empty array of integers nums, every element appears twice except
	 one. Find that single one.

	You must implement a solution with a linear runtime complexity and use only
	constant extra space.
	
	Example 1:
	Input: nums = [2,2,1]
	Output: 1*/
public class Question_6 {

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 2, 1, 1, 0 };
		int res = findNum(nums);

		System.out.println("Result is " + res);
	}

	static int findNum(int[] nums) {
		int res = 0;
		// Performing Bitwise XOR operation (XOR of two same numbers is ZERO)
		for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}
		return res;
	}

}
