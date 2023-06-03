package in.ineuron;

/**
 * You have n coins and you want to build a staircase with these coins. The
 * staircase consists of k rows where the ith row has exactly i coins. The last
 * row of the staircase **may be** incomplete.
 * 
 * Given the integer n, return *the number of **complete rows** of the staircase
 * you will build*.
 ** 
 * Example 1:**
 ** 
 * 
 * Input:** n = 5
 ** 
 * Output:** 2
 ** 
 * Explanation:** Because the 3rd row is incomplete, we return 2.
 */

public class Question_2 {

	public static void main(String[] args) {
		int res = maxCompleteRows(10);

		System.out.println("Result is " + res);
	}

	public static int maxCompleteRows(int n) {
		int max = 0;
		int c = n;
		for (int i = 1; i <= c; i++) {
			if (n < i)
				break;
			else {
				c = c - i;
				max++;
			}

		}

		return max;
	}

}
