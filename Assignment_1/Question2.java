package com.ineuron.in;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int val = sc.nextInt();
		removeoccr(arr, val);
		sc.close();

	}

	public static void removeoccr(int arr[], int val) {

		int count = 0;
		int lastidx = arr.length - 1;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == val) {

				count++;
				if (arr[lastidx] != val) {

					int temp = arr[i];
					arr[i] = arr[lastidx];
					arr[lastidx] = temp;
					lastidx--;
					
				}
			}
		}
		System.out.print(count + ", arr = [");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}

}
