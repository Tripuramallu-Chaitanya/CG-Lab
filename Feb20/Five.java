package com;
import java.util.*;
public class Five {
	public static String middleThree(String str,int a) {
		return str.substring((a/2-1),(a/2+2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!");
		String str = sc.next();
		if (str.length()!=0)
			System.out.println(middleThree(str,str.length()));
		else
			System.out.println("Please enter valid string");
		sc.close();

	}

}
