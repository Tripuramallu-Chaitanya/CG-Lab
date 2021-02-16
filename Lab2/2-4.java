package com;
import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
		System.out.println("array length enter chey Baabaay!");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Baabaay inka undi.... Enter array elements!!!");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		input.close();
	}

}
