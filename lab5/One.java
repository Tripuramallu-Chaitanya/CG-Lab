package com;
import java.util.*;
class AgeException extends Exception{
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Invalid Age (Age<15)";
	}
	
}
public class One {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		input.close();
		try {
			if (age < 15)
				throw new AgeException();
			else
				System.out.println("Valid !!!");
		}
		catch(AgeException e) {
			System.out.println(e);
		}
	}

}
