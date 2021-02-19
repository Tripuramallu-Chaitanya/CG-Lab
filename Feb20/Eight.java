package com;
import java.util.*;
public class Eight {
	public static boolean sameStarChar(String str) {
		int a = str.indexOf("*");
		if (str.charAt(a-1) == str.charAt(a+1))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!!!");
		String str = sc.next();
		System.out.println(sameStarChar(str));
		sc.close();
	}

}
