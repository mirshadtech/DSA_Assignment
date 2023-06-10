package in.ineuron;

import java.util.HashMap;

/**
 * Given a string num which represents an integer, return true *if* num *is a
 * **strobogrammatic number***.
 * 
 * A **strobogrammatic number** is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 ** 
 * Example 1:**
 ** 
 * Input:** num = "69"
 ** 
 * Output:**
 * 
 * true
 */
public class Question_2 {

	public static void main(String[] args) {

		String str = "619";
		boolean res = strobogrammaticNumber(str);

		System.out.println("Result is " + res);
	}

	public static boolean strobogrammaticNumber(String num) {

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('8', '8');
		map.put('6', '9');
		map.put('9', '6');

		int i = 0;
		int j = num.length() - 1;
		while (i <= j) {
			if (map.containsKey(num.charAt(i)) && map.containsKey(num.charAt(j))
					&& map.get(num.charAt(i)) == num.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}

		return true;
	}
}
