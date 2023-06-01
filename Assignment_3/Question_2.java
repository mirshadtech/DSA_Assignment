package in.ineuron;
/*
 * Question 2
 Given an array nums of n integers, return an array of all the unique quadruplets
 [nums[a], nums[b], nums[c], nums[d]] such that:
           ● 0 <= a, b, c, d < n
           ● a, b, c, and d are distinct.
           ● nums[a] + nums[b] + nums[c] + nums[d] == target

 You may return the answer in any order.

 Example 1:
 Input: nums = [1,0,-1,0,-2,2], target = 0
 Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]*/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * Given an array nums of n integers, return an array of all the unique quadruplets
    [nums[a], nums[b], nums[c], nums[d]] such that:
           ● 0 <= a, b, c, d < n
           ● a, b, c, and d are distinct.
           ● nums[a] + nums[b] + nums[c] + nums[d] == target

	You may return the answer in any order.

	Example 1:
	Input: nums = [1,0,-1,0,-2,2], target = 0
	Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * */
public class Question_2 {

	public static void main(String[] args) {

		int target = 0;
		int[] nums = new int[] { 1,0,-1,0,-2,2};
		List<List<Integer>> res = fourSum(nums, target);

		System.out.println("Result is "+res);
	}

	static List<List<Integer>> fourSum(int[] nums, int target) {

		Arrays.sort(nums);
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i] == nums[i + 1])
				continue;
			threeSum(nums, i + 1, target, nums[i], list);
		}
		return list;
	}

	static void threeSum(int nums[], int i, int target, int n1, List<List<Integer>> list) {
		for (int j = i; j < nums.length; j++) {
			int s = n1 + nums[j];
			twoSum(nums, s, target, j + 1, n1, nums[j], list);
		}
	}

	static void twoSum(int[] nums, long s, int target, int low, int n1, int n2, List<List<Integer>> list) {
		int high = nums.length - 1;
		while (low < high) {
			long sum = nums[low] + nums[high] + s;
			if (sum == target) {
				LinkedList<Integer> l = new LinkedList<Integer>();
				l.add(n1);
				l.add(n2);
				l.add(nums[low]);
				l.add(nums[high]);
				if (!list.contains(l)) {
					list.add(l);
				}
			}
			if (sum < target)
				low++;
			else
				high--;
		}
	}

}
