package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Employee;

public interface EmployeeService {
	public Employee findEmployee(int empid);
	public List<Employee> printAllEmployee();
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> deleteEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp);
}
