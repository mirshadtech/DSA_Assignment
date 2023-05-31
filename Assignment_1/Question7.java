package in.ineuron;

import java.util.Arrays;
/*
 * <aside>
💡 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

</aside>*/

public class Question_7 {

	public static void main(String[] args) {

		int[] nums=new int[]{1,0,2,3,4,5,0,2,5,0,3};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void moveZeroes(int[] nums) {
		
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0)
				nums[j++]=nums[i];
		}
		while(j<nums.length)
			nums[j++]=0;

	}
}
