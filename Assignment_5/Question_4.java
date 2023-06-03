package in.ineuron;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
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
 */
public class Question_4 {

	public static void main(String[] args) {

		int[] nums2 = new int[] { 1, 2, 3 };
		int[] nusm1 = new int[] { 2, 4, 6 };
		List<List<Integer>> res = uniqueArrays(nusm1, nums2);
		for (List<Integer> lis : res) {
			System.out.println(lis);
		}
	}

	public static List<List<Integer>> uniqueArrays(int[] nums1, int[] nums2) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();

		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();

		for (int a : nums1)
			s1.add(a);

		for (int b : nums2) {
			s2.add(b);
			if (s1.contains(b))
				s1.remove(b);
		}

		for (int c : nums1) {
			if (s2.contains(c))
				s2.remove(c);
		}

		res.add(new ArrayList<>(s1));
		res.add(new ArrayList<>(s2));

		return res;
	}

}
