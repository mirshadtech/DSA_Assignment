package in.ineuron;

import java.util.Arrays;

/**
 * The **product sum** of two equal-length arrays a and b is equal to the sum of
 * a[i] * b[i] for all 0 <= i < a.length (**0-indexed**).
 * 
 * - For example, if a = [1,2,3,4] and b = [5,2,3,1], the **product sum** would
 * be 1*5 + 2*2 + 3*3 + 4*1 = 22.
 * 
 * Given two arrays nums1 and nums2 of length n, return *the **minimum product
 * sum** if you are allowed to **rearrange** the **order** of the elements in*
 * nums1.
 ** 
 * Example 1:**
 ** 
 * Input:** nums1 = [5,3,4,2], nums2 = [4,2,2,5]
 ** 
 * Output:** 40
 ** 
 * Explanation:**
 * 
 * We can rearrange nums1 to become [3,5,4,2]. The product sum of [3,5,4,2] and
 * [4,2,2,5] is 3*4 + 5*2 + 4*2 + 2*5 = 40.
 */
public class Question_5 {

	public static void main(String[] args) {

		int[] a = new int[] { 5, 3, 4, 2 };
		int[] b = new int[] { 4, 2, 2, 5 };
		long res = minValue(a, b);

		System.out.println(res);
	}

	public static long minValue(int a[], int b[]) {
		Arrays.sort(a);
		Arrays.sort(b);
		reverse(b);

		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}

		return sum;
	}

	static void reverse(int[] b) {
		int left = 0;
		int right = b.length - 1;
		while (left < right) {
			int temp = (int) b[left];
			b[left] = b[right];
			b[right] = temp;
			left++;
			right--;

		}
	}
}
