package com;

import java.util.Arrays;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter length of array");
		int n = input.nextInt();
		String arr[] = new String[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		if (n%2==0){
			for(int i=0;i<n/2;i++) { 
				  System.out.println(arr[i].toUpperCase());
				  }
			for(int i=(n/2);i<n;i++) { 
				  System.out.println(arr[i].toLowerCase());
				  }
		}
		else {
			for(int i=0;i<(n+1)/2;i++) { 
				  System.out.println(arr[i].toUpperCase());
				  }
			for(int i=((n+1)/2);i<n;i++) { 
				  System.out.println(arr[i].toLowerCase());
				  }
		}
		input.close();
		
	}

}
