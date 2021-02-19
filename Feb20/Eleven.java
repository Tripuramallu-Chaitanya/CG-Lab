package com;
import java.util.*;
public class Eleven {
	public static boolean squirrelPlay(int temp, boolean val) {
		if ((temp>=60 && temp<=90)||(val && temp>90 && temp<=100))
			return true;
		else  
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature and boolean value of summer");
		int temp = sc.nextInt();
		boolean val = sc.nextBoolean();
		System.out.println(squirrelPlay(temp, val));
		sc.close();
	}

}
