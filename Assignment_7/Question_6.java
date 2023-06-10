package in.ineuron;

/**
 * Given two strings s and goal, return true *if and only if* s *can become*
 * goal *after some number of **shifts** on* s.
 * 
 * A **shift** on s consists of moving the leftmost character of s to the
 * rightmost position.
 * 
 * - For example, if s = "abcde", then it will be "bcdea" after one shift.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "abcde", goal = "cdeab"
 ** 
 * Output:**
 * 
 * true
 */
public class Question_6 {

	public static void main(String[] args) {

		String s = "abcde";
		String goal = "cdeab";
		System.out.println("Result is :: " + rotateString(s, goal));
	}

	public static boolean rotateString(String s, String goal) {
		if (s.length() != goal.length())
			return false;

		if (s.equals(goal))
			return true;
		for (int i = 0; i < s.length(); i++) {
			String s1 = s.substring(i + 1, s.length()) + s.substring(0, i + 1);
			if (s1.equals(goal))
				return true;
		}

		return false;
	}

	
}
