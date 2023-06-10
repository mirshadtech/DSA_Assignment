package in.ineuron;

import java.util.Arrays;

/**
 * Given an array of characters chars, compress it using the following
 * algorithm:
 * 
 * Begin with an empty string s. For each group of **consecutive repeating
 * characters** in chars:
 * 
 * - If the group's length is 1, append the character to s. - Otherwise, append
 * the character followed by the group's length.
 * 
 * The compressed string s **should not be returned separately**, but instead,
 * be stored **in the input character array chars**. Note that group lengths
 * that are 10 or longer will be split into multiple characters in chars.
 * 
 * After you are done **modifying the input array,** return *the new length of
 * the array*.
 * 
 * You must write an algorithm that uses only constant extra space.
 ** 
 * Example 1:**
 ** 
 * Input:** chars = ["a","a","b","b","c","c","c"]
 ** 
 * Output:** Return 6, and the first 6 characters of the input array should be:
 * ["a","2","b","2","c","3"]
 ** 
 * Explanation:**
 * 
 * The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 */
public class Question_5 {
	public static void main(String[] args) {

		char[] chars = new char[] { 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'a', 'a' };
		int res = compress(chars);
		System.out.println("Result is " + res);
		System.out.println(Arrays.toString(chars));
	}

	public static int compress(char[] chars) {

		if (chars.length == 1)
			return 1;

		int i = 0;

		String s = "";
		while (i < chars.length) {
			int count = 0;
			char ch = chars[i];

			while (i < chars.length && chars[i] == ch) {
				count++;
				i++;
			}

			if (count > 1)
				s = s + String.valueOf(ch) + count;
			else {
				s = s + String.valueOf(ch);
			}

		}

		for (int j = 0; j < s.length(); j++) {
			chars[j] = s.charAt(j);
		}

		return s.length();
	}
}