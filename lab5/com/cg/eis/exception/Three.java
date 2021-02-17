package com.cg.eis.exception;
import java.util.*;
class EmployeeException extends Exception{
	public String toString() {
		return "Invalid!!!";
	}
}
public class Three {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int salary = input.nextInt();
		input.close();
		try {
			if(salary<3000) 
				throw new EmployeeException();
			else
				System.out.println("salary is: "+salary);
			
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}
	}
}
