package com;
import java.util.*;
public class One {
	public static String withouEnd2(String str) {
		int a = str.length();
		if (a == 0) 
			return "Please enter a valid string";
		else
			return str.substring(1, (a-1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!");
		String str = sc.next();
		System.out.println(withouEnd2(str));
		sc.close();
	}

}
