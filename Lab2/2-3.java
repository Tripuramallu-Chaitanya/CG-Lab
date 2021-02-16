package com;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int rev = 0, rem = 0;
			while (arr[i] != 0) {
				rem = arr[i] % 10;
				rev = rev * 10 + rem;
				arr[i] /= 10;
			}
			arr[i] = rev;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+"\t");
		}

		input.close();

	}

}
