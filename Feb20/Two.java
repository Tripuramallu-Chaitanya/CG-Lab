package com;
import java.util.*;
public class Two {
	public static String middleTwo(String str, int i) {
		return str.substring(i-1,i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string!");
		String str = sc.next();
		int a = str.length();
		if (a==0)
			System.out.println("Please enter valid string");
		else
			System.out.println(middleTwo(str,a/2));
		sc.close();
	}

}
