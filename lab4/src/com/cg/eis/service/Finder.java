package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Finder implements EmployeeService{
	public String inScm(Employee emp) {
		double salary = emp.getSalary();
		String designation = emp.getDesignation();
		if (salary>=30000 && designation.equals("Analyst"))
			return "First Scheme";
		else if (salary>=40000 && designation.equals("Analyst"))
			return "Second Scheme";
		else if (salary>=50000 && designation.equals("Senior Analyst"))
			return "Third Scheme";
		else if (salary>=60000 && designation.equals("Senior Analyst"))
			return "Fourth Scheme";
		else
			return "Fifth Scheme";
	}
	@Override
	public Employee  setDetails(int id, String name, double salary, String designation) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		emp.setInsurancescheme(inScm(emp));
		return emp;
	}
	@Override
	public void dispEmp(Employee emp) {
		System.out.println("Employee name is "+emp.getName());
		System.out.println("Employee id is "+emp.getId());
		System.out.println("Employee salary is "+emp.getSalary());
		System.out.println("Employee designation is "+emp.getDesignation());
		System.out.println("Employee Insurance Scheme is "+emp.getInsurancescheme());
	}
}


