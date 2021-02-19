package com;
import java.util.*;
public class Four {
	public static String nTwice(String str, int a) {
		if (str.length()==a)
			return str;
		else
			return str.substring(0, a)+str.substring(str.length()-a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String! and n");
		String str = sc.next();
		int n = sc.nextInt();
		System.out.println(nTwice(str,n));
		sc.close();

	}

}
