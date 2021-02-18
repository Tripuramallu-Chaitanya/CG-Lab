package com;
import java.util.*;
public class Three {
	public static boolean endsLy(String str, int a) {
		str = str.substring(a-2);
		return (str.equals("ly")?true:false);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!");
		String str = sc.next();
		int a = str.length();
		System.out.println(endsLy(str,a));
		sc.close();
	}

}
