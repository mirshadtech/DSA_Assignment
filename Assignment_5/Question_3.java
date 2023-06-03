package in.ineuron;

/**
 * <aside>
💡

Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

**Input:** nums = [-4,-1,0,3,10]

**Output:** [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].

After sorting, it becomes [0,1,9,16,100].

</aside>*/
import java.util.Arrays;

public class Question_3 {

	public static void main(String[] args) {
		int[] nums = new int[] { -4, -1, 0, 3, 10 };
		sortedSquares(nums);
		System.out.println("Result is " + Arrays.toString(nums));
	}

	public static int[] sortedSquares(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}
