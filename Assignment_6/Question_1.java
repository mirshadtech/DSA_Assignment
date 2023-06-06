package in.ineuron;

/**
 * <aside>
💡 **Question 1**

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]

</aside>*/
import java.util.Arrays;

public class Question_1 {

	public static void main(String[] args) {

		String str = "IDID";
		int[] res = diStringMatch(str);

		System.out.println(Arrays.toString(res));
	}

	public static int[] diStringMatch(String s) {

		int size = s.length();
		int low = 0;
		int high = size;
		int[] res = new int[size + 1];

		for (int i = 0; i < size; i++) {
			if (s.charAt(i) == 'I')
				res[i] = low++;
			if (s.charAt(i) == 'D')
				res[i] = high--;
		}
		res[size] = high;
		return res;
	}
}
