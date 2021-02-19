package com;
import java.util.*;
public class Ten {
	public static int sumDigits(String str) {
		char[] c = str.toCharArray();
		int count = 0;
		for(char i:c) {
			if (Character.isDigit(i)) {
				String b = ""+i;
				int a = Integer.parseInt(b);
				count+=a;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!");
		String str = sc.next();
		sc.close();
		System.out.println(sumDigits(str));
	}
}
