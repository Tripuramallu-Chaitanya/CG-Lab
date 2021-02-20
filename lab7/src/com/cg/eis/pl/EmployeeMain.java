package com.cg.eis.pl;
import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceImpl eser = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		String ch ="yes";
		while (ch.equalsIgnoreCase("yes")) {
			System.out.println("Enter 1 for getting employee details through scheme");
			System.out.println("Enter 2 to get all employee details");
			System.out.println("Enter 3 to delete a record of particular employee");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("enter scheme");
				String str = sc.nextLine();
				Map <Integer,Employee> n = eser.displayEmployee(str);
				System.out.println(n);
				break;
			case 2:
				System.out.println(eser.showEmployee());
				break;
			case 3:
				System.out.println("Enter employee id");
				int id = sc.nextInt();
				System.out.println(eser.deletion(id));
				break;
			default:
				System.out.println("Invalid");
				
			}
			System.out.println("do u want to continue");
			ch = sc.next();
		}
		sc.close();
	}

}
