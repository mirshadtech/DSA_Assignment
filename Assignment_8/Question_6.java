package in.ineuron;

/**
 * <aside>
💡 **Question 6**

Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"

**Output:** [0,6]

**Explanation:**

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".

</aside>
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question_6 {

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> res = findAnagrams(s, p);
		System.out.println("Result"+ res);
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<>();

		HashMap<Character, Integer> pmap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> smap = new HashMap<Character, Integer>();

		for (char c : p.toCharArray()) {
			pmap.put(c, pmap.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			String temp = "";
			if (i + p.length() <= s.length())
				temp = s.substring(i, i + p.length());

			if (temp.length() < p.length())
				break;

			smap.clear();

			for (Character c : temp.toCharArray()) {
				smap.put(c, smap.getOrDefault(c, 0) + 1);
				boolean r = compare(pmap, smap);
				if (r)
					res.add(i);
			}
		}

		return res;
	}

	private static boolean compare(HashMap<Character, Integer> pmap, HashMap<Character, Integer> smap) {
		if (pmap.size() != smap.size())
			return false;

		for (Character c : pmap.keySet()) {
			if (!smap.containsKey(c))
				return false;

			int val1 = smap.get(c);
			int val2 = pmap.get(c);

			if (val1 != val2)
				return false;

		}
		return true;
	}
}
