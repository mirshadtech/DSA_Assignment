package in.ineuron;

/*
 * You are given an integer array nums and an integer k.
	In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i]
	to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at
	most once for each index i.
	The score of nums is the difference between the maximum and minimum elements in nums.
	Return the minimum score of nums after applying the mentioned operation at most once for
	each index in it.
	Example 1:
	Input: nums = [1], k = 0
	Output: 0
	Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.*/
public class Question_8 {

	public static void main(String[] args) {
		
		int k = 3;
		int[] nums = new int[] { 1, 3, 6 };
		int res = smallestRangeI(nums, k);

		System.out.println("Result is " + res);
	}

	public static int smallestRangeI(int[] nums, int k) {

		int min = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		min = min + k;
		max = max - k;
		if (min >= max)
			return 0;
		else
			return max - min;
	}
}
