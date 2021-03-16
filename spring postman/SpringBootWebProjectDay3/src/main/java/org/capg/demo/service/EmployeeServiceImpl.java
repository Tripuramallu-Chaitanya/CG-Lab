package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Employee;
import org.capg.demo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao edao;
	@Override
	
	public List<Employee> printAllEmployee() {
		return edao.getAllEmployee();
	}
	@Override
	public Employee findEmployee(int empid) {
		return edao.findEmployee(empid);
	}
	@Override
	public List<Employee> createEmployee(Employee emp) {
		if(emp.getEmpid()==0 || emp.getName()==null)
			return null;
		else
			return edao.createEmployee(emp);
	}
	@Override
	public List<Employee> deleteEmployee(int empid) {
		return edao.deleteEmployee(empid);
	}
	@Override
	public List<Employee> updateEmployee(Employee emp) {
		if (emp.getEmpid()==0)
			return null;
		else
			return edao.updateEmployee(emp);
	}
	

}
