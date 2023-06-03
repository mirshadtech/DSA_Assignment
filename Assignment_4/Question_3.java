package in.ineuron;

import java.util.Arrays;

/**
 * <aside> 💡 **Question 3** Given a 2D integer array matrix, return *the
 * **transpose** of* matrix.
 * 
 * The **transpose** of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices.
 ** 
 * Example 1:**
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * 
 * </aside>
 */
public class Question_3 {

	public static void main(String[] args) {

		// int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix = new int[][] { { 1, 2 }, { 4, 5 }, { 7, 9 } };

		int[][] nums = transpose(matrix);
		System.out.println("Output is");
		for (int[] a : nums) {
			System.out.println(Arrays.toString(a));
		}
	}

	public static int[][] transpose(int[][] matrix) {

		int r = matrix.length;
		int c = matrix[0].length;
		int[][] nums = new int[c][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				nums[j][i] = matrix[i][j];
			}
		}
		return nums;

	}

}
