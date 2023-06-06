package in.ineuron;

/**
 * <aside> 💡 **Question 3**
 * 
 * Given an array of integers arr, return *true if and only if it is a valid
 * mountain array*.
 * 
 * Recall that arr is a mountain array if and only if:
 * 
 * - arr.length >= 3 - There exists some i with 0 < i < arr.length - 1 such
 * that: - arr[0] < arr[1] < ... < arr[i - 1] < arr[i] - arr[i] > arr[i + 1] >
 * ... > arr[arr.length - 1]
 * 
 * **Example 1:**
 ** 
 * Input:** arr = [2,1]
 ** 
 * Output:**
 * 
 * false </aside>
 */
public class Question_3 {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 2, 3, 4, 5, 2, 1, 0 };
		System.out.println("Result is :: " + validMountainArray(nums));
	}

	private static boolean validMountainArray(int[] arr) {

		int j = 0;
		// Finding the tip point i.e; from where the array is in descending order
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				j = i;
				break;
			}
		}

		// if tip point is zero return false
		if (j == 0)
			return false;

		// Checking the array from 0th position to tip point
		for (int i = 0; i < j; i++) {
			if (arr[i] < arr[i + 1]) {
				continue;
			} else {
				return false;
			}
		}

		// Checking the array from last position to tip point
		for (int i = arr.length - 1; i > j; i--) {
			if (arr[i] < arr[i - 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;

	}

}
