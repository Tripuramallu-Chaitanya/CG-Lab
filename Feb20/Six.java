package com;
import java.util.*;
public class Six {
	public static String repeatSeperator(String str1, String str2, int a) {
		StringBuffer sb = new StringBuffer();
		if (str1.length()>str2.length()) {
			sb.append(str1);
			for(int i=1;i<a;i++) {
				sb.append(str2);
				sb.append(str1);
			}
		}
		else {
			sb.append(str2);
			for(int i=1;i<a;i++) {
				sb.append(str1);
				sb.append(str2);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings and count");
		String str1 = sc.next();
		String str2 = sc.next();
		int a = sc.nextInt();
		System.out.println(repeatSeperator(str1, str2, a));
		sc.close();
	}
}
