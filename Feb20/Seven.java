package com;
import java.util.*;
public class Seven {
	public static String getSandwich(String str) {
		int a = str.indexOf("bread");
		if (a!=-1) {
			int b = str.indexOf("bread",a+1);
			if (b!=-1) {
				return str.substring(a+5, b);
			}
			else
				return "Invalid input";
		}
		else
			return "Invalid input";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!!!");
		String str = sc.nextLine();
		System.out.println(getSandwich(str));
		sc.close();
	}
}
