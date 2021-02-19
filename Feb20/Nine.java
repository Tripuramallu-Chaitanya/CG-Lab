package com;
import java.util.*;
public class Nine {
	public static int countTriple(String str) {
		int count = 0;
		for (int i=0;i<str.length()-2;i++) {
			char temp = str.charAt(i);
			if (temp == str.charAt(i+1) && temp == str.charAt(i+2))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!");
		String str = sc.next();
		sc.close();
		System.out.println(countTriple(str));
	}
}