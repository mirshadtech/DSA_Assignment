package in.ineuron;

import java.util.Stack;

/**
 * Given two strings s and t, return true *if they are equal when both are typed
 * into empty text editors*. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "ab#c", t = "ad#c"
 ** 
 * Output:** true
 ** 
 * Explanation:**
 * 
 * Both s and t become "ac".
 */
public class Question_7 {

	public static void main(String[] args) {

		String t = "ab##";
		String s = "c#d#";
		System.out.println(backspaceCompare(s, t));
	}

	public static boolean backspaceCompare(String s, String t) {
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		int i = 0;
		int j = 0;
		while (i < s.length()) {
			if (s.charAt(i) == '#') {
				if (!stack1.isEmpty())
					stack1.pop();
			} else
				stack1.push(s.charAt(i));
			i++;
		}

		while (j < t.length()) {
			if (t.charAt(j) == '#') {
				if (!stack2.isEmpty())
					stack2.pop();
			} else
				stack2.push(t.charAt(j));
			j++;
		}
		System.out.println(stack1);
		System.out.println(stack2);
		if (stack1.equals(stack2))
			return true;

		return false;
	}

}
