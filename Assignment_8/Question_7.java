package in.ineuron;

import java.util.Stack;

/***
 * <aside> 💡
 * 
 * Given an encoded string, return its decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the
 * square brackets is being repeated exactly k times. Note that k is guaranteed
 * to be a positive integer.
 * 
 * You may assume that the input string is always valid; there are no extra
 * white spaces, square brackets are well-formed, etc. Furthermore, you may
 * assume that the original data does not contain any digits and that digits are
 * only for those repeat numbers, k. For example, there will not be input like
 * 3a or 2[4].
 * 
 * The test cases are generated so that the length of the output will never
 * exceed 105.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "3[a]2[bc]"
 ** 
 * Output:** "aaabcbc"
 * 
 * </aside>
 */
public class Question_7 {

	public static void main(String[] args) {

		String s = "3[a]2[bc]";
		String res = decodeString(s);
		System.out.println("Result is " + res);
	}

	public static String decodeString(String s) {

		Stack<Integer> numStack = new Stack<>();
		Stack<String> stringStack = new Stack<>();
		int k = 0;

		for (char c : s.toCharArray()) {

			if (Character.isDigit(c)) {
				k = (k * 10) + (c - '0');
				continue;
			}

			if (c == '[') {
				numStack.push(k);
				k = 0;
				stringStack.push(String.valueOf(c));
				continue;
			}

			if (c != ']') {
				stringStack.push(String.valueOf(c));
				continue;
			}

			StringBuilder temp = new StringBuilder();
			while (!stringStack.peek().equals("["))
				temp.insert(0, stringStack.pop());

			stringStack.pop();

			StringBuilder replacement = new StringBuilder();
			int count = numStack.pop();
			for (int i = 0; i < count; i++)
				replacement.append(temp);

			stringStack.push(replacement.toString());
		}

		StringBuilder result = new StringBuilder();
		while (!stringStack.empty()) {
			result.insert(0, stringStack.pop());
		}
		return result.toString();
	}

}
