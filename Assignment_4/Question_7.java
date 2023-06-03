package in.ineuron;

/**
 * <aside> 💡 **Question 7** You are given an m x n matrix M initialized with
 * all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y]
 * should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
 * 
 * Count and return *the number of maximum integers in the matrix after
 * performing all the operations*
 ** 
 * Example 1:**
 * 
 ** 
 * Input:** m = 3, n = 3, ops = [[2,2],[3,3]]
 ** 
 * Output:** 4
 ** 
 * Explanation:** The maximum integer in M is 2, and there are four of it in M.
 * So return 4.
 * 
 * </aside>
 */

public class Question_7 {

	public static void main(String[] args) {
		int[][] ops = new int[][] { { 2, 2 }, { 3, 3 } };
		int n = 3;
		int m = 3;
		int res = maxCount(m, n, ops);

		System.out.println("Result is " + res);
	}

	public static int maxCount(int m, int n, int[][] ops) {

		int minRow = m;
		int mincol = n;
		for (int[] o : ops) {
			minRow = Math.min(minRow, o[0]);
			mincol = Math.min(mincol, o[1]);
		}
		return minRow * mincol;
	}

}
