package in.ineuron;

import java.util.Arrays;
import java.util.HashMap;

/**
 * An integer array original is transformed into a **doubled** array changed by
 * appending **twice the value** of every element in original, and then randomly
 * **shuffling** the resulting array.
 * 
 * Given an array changed, return original *if* changed *is a **doubled** array.
 * If* changed *is not a **doubled** array, return an empty array. The elements
 * in* original *may be returned in **any** order*.
 ** 
 * Example 1:**
 ** 
 * Input:** changed = [1,3,4,2,6,8]
 ** 
 * Output:** [1,3,4]
 ** 
 * Explanation:** One possible original array could be [1,3,4]:
 * 
 * - Twice the value of 1 is 1 * 2 = 2. - Twice the value of 3 is 3 * 2 = 6. -
 * Twice the value of 4 is 4 * 2 = 8.
 * 
 * Other original arrays could be [4,3,1] or [3,1,4].
 */
public class Question_6 {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 3, 4, 2, 6, 8 };
		int[] res = findOriginalArray(nums);
		System.out.println(Arrays.toString(res));
	}

	static int[] findOriginalArray(int[] nums) {

		if (nums.length % 2 != 0)
			return new int[0];
		Arrays.sort(nums);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		System.out.println(map);
		int[] res = new int[nums.length / 2];

		int index = 0;
		for (int num : nums) {

			if (map.get(num) == 0)
				continue;

			if (!map.containsKey(2 * num))
				return new int[0];

			if (index < res.length && map.get(2 * num) > 0 && map.get(num) > 0) {
				res[index++] = num;
			}

			map.put(num, map.get(num) - 1);
			map.put(2 * num, map.get(2 * num) - 1);
		}
		if (index != res.length)
			return new int[0];

		return res;
	}

}
