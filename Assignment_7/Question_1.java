package in.ineuron;

import java.util.HashMap;

/**
 * Given two strings s and t, *determine if they are isomorphic*.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 ** 
 * Example 1:**
 ** 
 * Input:** s = "egg", t = "add"
 ** 
 * Output:** true
 */
public class Question_1 {

	public static void main(String[] args) {

		String s = "badc";
		String t = "baba";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Character> map1 = new HashMap<Character, Character>();
		HashMap<Character, Character> map2 = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			if (map1.containsKey(s.charAt(i))) {
				if (map1.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			}

			else if (map2.containsKey(t.charAt(i))) {
				if (map2.get(t.charAt(i)) != s.charAt(i)) {
					return false;
				}
			} else {

				map1.put(s.charAt(i), t.charAt(i));
				map2.put(t.charAt(i), s.charAt(i));
			}
		}
		System.out.println(map1);
		System.out.println(map2);

		return true;
	}

}
