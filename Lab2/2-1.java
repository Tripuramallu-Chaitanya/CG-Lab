package com;

import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
		input.close();

	}

}
