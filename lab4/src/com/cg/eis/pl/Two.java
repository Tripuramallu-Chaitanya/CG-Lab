package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Finder;

import java.util.*;
public class Two {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Finder boom = new Finder();
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		String name = input.next();
		double salary = input.nextDouble();
		String designation = input.next();
		input.close();
		emp = boom.setDetails(id, name, salary, designation);
		System.out.println(boom.inScm(emp));
		boom.dispEmp(emp);
	}

}
