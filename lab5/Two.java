package com;
class NameException extends Exception{
	public String toString() {
		return "Invalid input";
	}
}
public class Two {

	public static void main(String[] args) {
		String fname = new String();
		String lname = "Chaitanya";
		try {
			if (fname.isEmpty()||lname.isEmpty()) 
				throw new NameException();
			System.out.println("Full Name: "+fname+lname);
		}
		catch (NameException e) {
			System.out.println(e);
		}
	}
}
