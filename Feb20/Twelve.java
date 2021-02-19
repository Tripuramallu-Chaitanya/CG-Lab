package com;
import java.util.*;
public class Twelve {
	public static int caughtSpeeding(int a, boolean val) {
		if (val) {
			if(a<=65)
				return 0;
			else if(a>65 && a<=85)
				return 1;
			else
				return 2;
		}
		else {
			if(a<=60)
				return 0;
			else if(a>60 && a<=80)
				return 1;
			else
				return 2;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your speed and boolean value of birthday");
		int speed = sc.nextInt();
		boolean val = sc.nextBoolean();
		System.out.println(caughtSpeeding(speed,val));
		sc.close();
	}

}
