package in.ineuron;

import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 * 
 * Return the array in the form* [x1,y1,x2,y2,...,xn,yn].
 ** 
 * Example 1:**
 ** 
 * Input:** nums = [2,5,1,3,4,7], n = 3
 ** 
 * Output:** [2,3,5,4,1,7]
 ** 
 * Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
 * [2,3,5,4,1,7].
 */
public class Question_8 {

	public static void main(String[] args) {

		int n = 3;
		int[] nums = new int[] { 2, 5, 1, 3, 4, 7 };
		int[] res = shuffle(nums, n);
		System.out.println("Result is " + Arrays.toString(res));
	}

	public static int[] shuffle(int[] nums, int n) {

		int res[] = new int[nums.length];
		int i = 0;
		int j = n;
		int c = 0;
		while (i < n && j < nums.length) {
			res[c++] = nums[i++];
			res[c++] = nums[j++];
		}
		return res;
	}

}
