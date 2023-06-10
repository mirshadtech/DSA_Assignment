package in.ineuron;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * <aside> 💡 **Question 8**
 * 
 * Given two strings s and goal, return true *if you can swap two letters in* s
 * *so the result is equal to* goal*, otherwise, return* false*.*
 * 
 * Swapping letters is defined as taking two indices i and j (0-indexed) such
 * that i != j and swapping the characters at s[i] and s[j].
 * 
 * - For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 ** 
 * Example 1:**
 ** 
 * Input:** s = "ab", goal = "ba"
 ** 
 * Output:** true
 ** 
 * Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is
 * equal to goal.
 * 
 * </aside>
 */
public class Question_8 {

	public static void main(String[] args) {

		String b = "aaaabc";
		String a = "aaaacb";
		boolean res = buddyStrings(a, b);

		System.out.println("Result is " + res);
	}

	public static boolean buddyStrings(String a, String b) {

		if (a.length() != b.length())
			return false;

		if (a.equals(b)) {
			HashSet<Character> set = new HashSet<Character>();
			for (int i = 0; i < a.length(); i++) {
				if (set.contains(a.charAt(i)))
					return true;
				set.add(a.charAt(i));
			}
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i))
					list.add(i);
			}

			return list.size() == 2 && a.charAt(list.get(0)) == b.charAt(list.get(1))
					&& a.charAt(list.get(1)) == b.charAt(list.get(0));
		}

		return false;
	}
}
