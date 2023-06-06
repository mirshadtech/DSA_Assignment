package in.ineuron;

/**
 * <aside> 💡 **Question 2**
 * 
 * You are given an m x n integer matrix matrix with the following two
 * properties:
 * 
 * - Each row is sorted in non-decreasing order. - The first integer of each row
 * is greater than the last integer of the previous row.
 * 
 * Given an integer target, return true *if* target *is in* matrix *or* false
 * *otherwise*.
 * 
 * You must write a solution in O(log(m * n)) time complexity.
 ** 
 * Example 1:**
 ** 
 * 
 * Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 ** 
 * Output:** true
 * 
 * </aside>
 */
public class Question_2 {

	public static void main(String[] args) {

		int target = 3;
		int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		boolean res = searchMatrix(matrix, target);
		System.out.println("Result is " + res);
	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		for (int[] arr : matrix) {
			boolean res = binarySearch(arr, target);
			if (res == true)
				return true;
		}
		return false;
	}

	public static boolean binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target)
				return true;
			else if (arr[mid] < target)
				low = mid + 1;
			else if (arr[mid] > target)
				high = mid - 1;
		}
		return false;
	}
}
