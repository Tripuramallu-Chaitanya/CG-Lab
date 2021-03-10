package com;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	//@Value("${emp.id}")
	private int empid;
	//@Value("${emp.name}")
	private String name;
	private List<String> phone;
	

	@Autowired
	@Qualifier("add1")
	private Address address;

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	/*
	 * public Employee(int empid, String name, Address address) { super();
	 * this.empid = empid; this.name = name; this.address = address; }
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Country: " + address.getCountry());
		System.out.println("Employee City: " + address.getCity());
		System.out.println("Employee Zip: " + address.getZip());
		System.out.println("Employee Zip: " + phone);
	}
	
	
	
	public void initialize() {
		System.out.println("Employee created at "+new Date());
	}
	
	public void destroy() {
		System.out.println("Employee destroyed..");
	}

}
