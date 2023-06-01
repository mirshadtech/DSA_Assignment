package in.ineuron;

/*  An array is monotonic if it is either monotone increasing or monotone decreasing.
	An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
	monotone decreasing if for all i <= j, nums[i] >= nums[j].
	Given an integer array nums, return true if the given array is monotonic, or false otherwise.
	Example 1:
	Input: nums = [1,2,2,3]
	Output: true
 * 
 * */
public class Question_7 {

	public static void main(String[] args) {

		int[] nums = new int[] { 6, 5, 4, 4 };
		boolean res = isMonotonic(nums);

		System.out.println("Result is " + res);
	}

	static boolean isMonotonic(int[] nums) {

		if (nums[0] <= nums[nums.length - 1]) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (!(nums[i + 1] >= nums[i])) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < nums.length - 1; i++) {
				if (!(nums[i + 1] <= nums[i])) {
					return false;
				}
			}
		}
		return true;
	}

}
