package in.ineuron;

import java.util.LinkedList;
import java.util.List;

/**
 * <aside> 💡 Given three integer arrays arr1, arr2 and arr3 **sorted** in
 * **strictly increasing** order, return a sorted array of **only** the integers
 * that appeared in **all** three arrays.
 ** 
 * Example 1:**
 * 
 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * 
 * Output: [1,5]
 ** 
 * Explanation:** Only 1 and 5 appeared in the three arrays.
 * 
 * </aside>
 * 
 * <aside> 💡 **Question 2**
 * 
 * </aside>
 */

public class Question_1 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 1, 2, 3, 5, 7, 9 };
		int[] arr3 = new int[] { 1, 2, 3, 4, 5, 8 };

		List<Integer> res = arraysIntersection(arr1, arr2, arr3);

		System.out.println("Result is " + res);
	}

	public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
				list.add(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}
		return list;
	}

}
