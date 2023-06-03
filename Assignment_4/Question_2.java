package in.ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * <aside> 💡 **Question 2**
 * 
 * Given two **0-indexed** integer arrays nums1 and nums2, return *a list*
 * answer *of size* 2 *where:*
 * 
 * - answer[0] *is a list of all **distinct** integers in* nums1 *which are
 * **not** present in* nums2*.* - answer[1] *is a list of all **distinct**
 * integers in* nums2 *which are **not** present in* nums1.
 ** 
 * Note** that the integers in the lists may be returned in **any** order.
 ** 
 * Example 1:**
 ** 
 * Input:** nums1 = [1,2,3], nums2 = [2,4,6]
 ** 
 * Output:** [[1,3],[4,6]]
 ** 
 * Explanation:**
 * 
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1
 * and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
 * 
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4
 * and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 * 
 * </aside>
 */
public class Question_2 {

	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2, 3 };
		int[] nums2 = new int[] { 2, 4, 6 };
		List<List<Integer>> res = findDifference(nums1, nums2);

		for (List<Integer> a : res) {
			System.out.println(a);
		}
	}

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		List<List<Integer>> resList = new ArrayList<List<Integer>>();

		TreeSet<Integer> s1 = new TreeSet<Integer>();
		TreeSet<Integer> s2 = new TreeSet<Integer>();

		for (int a : nums1)
			s1.add(a);

		for (int i = 0; i < nums2.length; i++) {
			s2.add(nums2[i]);
			if (s1.contains(nums2[i]))
				s1.remove(nums2[i]);
		}

		for (int i = 0; i < nums1.length; i++) {
			if (s2.contains(nums1[i]))
				s2.remove(nums1[i]);

		}

		resList.add(new ArrayList<Integer>(s1));
		resList.add(new ArrayList<Integer>(s2));

		return resList;
	}
}
