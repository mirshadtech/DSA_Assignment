package com.ineuron.in;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Element you want to Search:");
		int target = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans[] = findTarget2(arr, target);
		if (ans != null) {
			System.out.print("[" + ans[0] + "," + ans[1] + "]");

		} else {
			System.out.println("Target Sum not Found...");
		}
	}

	// O[n^2]
	public static int[] findTarget(int a[], int target) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++)
				if (a[i] + a[j] == target) {
					return new int[] { i, i + 1 };
				}
		}
		return null;

	}

	// O[N]-----Efficient Approach
	public static int[] findTarget2(int a[], int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int sum = target - a[i];

			if (map.containsKey(sum)) {
				return new int[] { map.get(sum), i };
			} else {
				map.put(a[i], i);
			}
		}

		return null;

	}

}
