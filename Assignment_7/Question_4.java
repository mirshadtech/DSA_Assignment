package in.ineuron;

/**
 * Given a string s, reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "Let's take LeetCode contest"
 ** 
 * Output:** "s'teL ekat edoCteeL tsetnoc"
 */
public class Question_4 {

	public static void main(String[] args) {

		String s = "Let's take LeetCode contest";
		String res = reverseWords(s);
		System.out.println(res);

	}

	public static String reverseWords(String s) {

		String[] words = s.split(" ");

		String res = "";
		for (String str : words) {
			int i = str.length() - 1;
			while (i >= 0)
				res += str.charAt(i--);
			res += " ";
		}
		return res.substring(0, res.length() - 1);
	}
}
