package in.ineuron;

/**
 * <aside> 💡 You have n coins and you want to build a staircase with these
 * coins. The staircase consists of k rows where the ith row has exactly i
 * coins. The last row of the staircase **may be** incomplete.
 * 
 * Given the integer n, return *the number of **complete rows** of the staircase
 * you will build*.
 * 
 * </aside>
 */
public class Question_5 {

	public static void main(String[] args) {

		int nums = 5;
		int res = arrangeCoins(nums);
		System.out.println("Result is " + res);
	}

	public static int arrangeCoins(int n) {

		int rows = 0;
		int c = n;
		for (int i = 1; i <= c; i++) {
			if (n < i) {
				break;
			} else {
				n -= i;
				rows++;
			}
		}
		return rows;
	}

}
