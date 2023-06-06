package in.ineuron;

/**
 * <aside>
💡 **Question 8**

Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2
 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

**Example 1:**


**Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]

**Output:**

[[7,0,0],[-7,0,3]]

</aside>*/
import java.util.Arrays;

public class Question_8 {

	public static void main(String[] args) {

		int[][] nums1 = new int[][] { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] nums2 = new int[][] { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

		int[][] res = matrixMulti(nums1, nums2);
		for (int[] a : res)
			System.out.println(Arrays.toString(a));
	}

	static int[][] matrixMulti(int[][] nums1, int[][] nums2) {

		if (nums1[0].length != nums2.length)
			return new int[0][];

		int m = nums1.length;
		int n = nums2[0].length;
		int[][] res = new int[m][n];

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2[0].length; j++) {
				int pro = 0;
				for (int k = 0; k < nums2[0].length; k++) {
					pro += nums1[i][k] * nums2[k][j];
				}
				res[i][j] = pro;
			}
		}

		return res;
	}
}
