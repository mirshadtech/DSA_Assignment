package in.ineuron;

import java.util.Arrays;

/**
 * Given a positive integer n, generate an n x n matrix filled with elements
 * from 1 to n2 in spiral order.
 ** 
 * Example 1:**
 ** 
 * 
 * Input:** n = 3
 ** 
 * Output:** [[1,2,3],[8,9,4],[7,6,5]]
 */
public class Question_7 {

	public static void main(String[] args) {
		int n = 3;
		int[][] res = generateMatrix(n);
		for (int a[] : res)
			System.out.println(Arrays.toString(a));
	}

	public static int[][] generateMatrix(int n) {

		int[][] res = new int[n][n];
		int left = 0;
		int rigth = n - 1;
		int up = 0;
		int down = n - 1;

		int index = 0;
		while (left <= rigth) {
			for (int col = left; col <= rigth; col++) {
				res[up][col] = ++index;
			}

			up++;
			for (int row = up; row <= down; row++) {
				res[row][rigth] = ++index;
			}
			rigth--;

			for (int col = rigth; col >= left; col--) {
				res[down][col] = ++index;
			}

			down--;

			for (int row = down; row >= up; row--) {
				res[row][left] = ++index;
			}
			left++;

		}
		return res;
	}

}
