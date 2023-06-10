package in.ineuron;

/**
 * Given a string s and an integer k, reverse the first k characters for every
 * 2k characters counting from the start of the string.
 * 
 * If there are fewer than k characters left, reverse all of them. If there are
 * less than 2k but greater than or equal to k characters, then reverse the
 * first k characters and leave the other as original.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "abcdefg", k = 2
 ** 
 * Output:**
 * 
 * "bacdfeg"
 */
public class Question_5 {

	public static void main(String[] args) {

		int k = 3;
		String s = "abcdefg";
		String res = reverseStr(s, k);
		System.out.println(res);
	}

	public static String reverseStr(String s, int k) {

		char[] ch = s.toCharArray();
		if (s.length() < k) {
			for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
				char c = ch[i];
				ch[i] = ch[j];
				ch[j] = c;
			}
			return String.valueOf(ch);
		}

		for (int i = 0; i < ch.length; i = i + (2 * k)) {
			int low = i;
			int high = i + k - 1;
			if (high > ch.length) {
				high = ch.length - 1;
			}
			while (low < high) {
				char c = ch[low];
				ch[low] = ch[high];
				ch[high] = c;
				low++;
				high--;
			}
		}
		return String.valueOf(ch);
	}

}
