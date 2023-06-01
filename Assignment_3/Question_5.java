package in.ineuron;

import java.util.Arrays;

/**
 * <aside>
💡 You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

</aside>*/
public class Question_5 {

	public static void main(String[] args) {

		int[] nums = new int[] {0,9,9,9};
		int[] res = addOne(nums);
		System.out.println("Result is " + Arrays.toString(res));
	}

	static int[] addOne(int[] nums) {
		if (nums[nums.length - 1] < 9) {
			nums[nums.length - 1] = nums[nums.length - 1] + 1;
			return nums;
		} else {
			for (int i = nums.length - 1; i >= 0; i--) {
				if (nums[i] == 9)
					nums[i] = 0;
				else {
					nums[i] = nums[i] + 1;
					return nums;
				}
			}
		}
		int[] res = new int[nums.length + 1];
		res[0] = 1;
		return res;
	}

}
