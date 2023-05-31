package in.ineuron;

import java.util.Arrays;

/*<aside>
💡 You are given a large integer represented as an integer array digits, where each digits[i] 
 is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
  The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

</aside>*/

public class Question_4 {

	public static void main(String[] args) {
		int[] digits = new int[] { 8, 9, 9, 9 };
		int[] res = plusOne(digits);
		System.out.println(Arrays.toString(res));

	}

	static int[] plusOne(int[] digits) {

		//Checking if last digit is <9
		if (digits[digits.length - 1] < 9) {
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
			return digits;
		} else {
			// If last digit is equal 9
			for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] == 9)
					digits[i] = 0;
				else {
					digits[i] = digits[i] + 1;
					return digits;
				}
			}
		}
		// If all the digits are equal to 9
		int arr[] = new int[digits.length + 1];
		arr[0] = 1;
		return arr;
	}
}
