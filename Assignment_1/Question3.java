package com.ineuron.in;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		// Input should be in Sorted Order
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Arrays.sort(arr);
		int target = sc.nextInt();
		int res = Searchelement(arr, target);
		System.out.println(res);
	}

	private static int Searchelement(int[] arr, int target) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] > target) {
				hi = mid - 1;

			} else if (arr[mid] < target) {
				lo = mid + 1;

			} else {
				return mid;
			}

		}
		
		return lo;

	}

}
