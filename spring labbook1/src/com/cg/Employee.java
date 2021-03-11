package com.cg;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	@Autowired
	private SBU businessUnit;
	private int age;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
//	public String getBusinessUnit() {
//		return businessUnit;
//	}
//	public void setBusinessUnit(String businessUnit) {
//		this.businessUnit = businessUnit;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public String toString() {
//		 
//		System.out.println("Employee details");
//		System.out.println("----------------------");
//		return "Employee [empAge="+age+", employeeId="+employeeId+", empName="+employeeName+", empSalary="+salary+"\n"+getSbuDetails();
////		System.out.println("Employee ID : "+employeeId);
////		System.out.println("Employee Name : "+employeeName);
////		System.out.println("Employee Salary : "+salary);
////		System.out.println("Sbu details: "+getSbuDetails());
////		System.out.println("Employee Age : "+age);
//	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
//	public SBU getSbuDetails() {
//		return new SBU(businessUnit.getSbuId(),businessUnit.getSbuName(),businessUnit.getSbuHead());
//		
//	}
//	public String toString() {
//		return age+"\t"+employeeId+"\t"+employeeName+"\t"+salary;
//	}
	public String toString() {
		return employeeId+"\t"+employeeName+"\t"+salary;
	}
}