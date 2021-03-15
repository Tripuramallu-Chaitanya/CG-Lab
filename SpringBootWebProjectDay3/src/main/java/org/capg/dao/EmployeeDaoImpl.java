package org.capg.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.capg.bean.Employee;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> empList;
	static {
		empList = new ArrayList<Employee>();
		empList.add(new Employee(101,"Chaitu",35000,LocalDate.parse("1999-12-15")));
		empList.add(new Employee(102,"Pavan",36000,LocalDate.parse("1998-09-04")));
		empList.add(new Employee(103,"Gundu",33000,LocalDate.parse("1998-06-29")));
		empList.add(new Employee(104,"Daffa",32000,LocalDate.parse("1999-03-27")));
	}
	@Override
	public List<Employee> getAllEmployee() {
		return empList;
	}
	@Override
	public Employee findEmployee(int empid) {
		for(Employee e:empList) {
			if(e.getEmpid()==empid)
				return e;
		}
		return null;
//		return empList.stream().filter(e->e.getEmpid()==empid).collect(Collectors.toList()).get(0);
	}
	@Override
	public List<Employee> createEmployee(Employee e) {
		empList.add(e);
		return empList;
	}
	@Override
	public List<Employee> deleteEmployee(int empid) {
		Employee e=findEmployee(empid);
		if(e!=null) {
			empList.remove(e);
			return empList;
		}
		else
			return null;
	}
	@Override
	public List<Employee> updateEmployee(Employee emp) {
		int counter = 0;
		for(Employee e:empList) {
			if(e.getEmpid()==emp.getEmpid()) {
				empList.set(counter, emp);
				return empList;
			}
			counter++;
		}
		return null;
	}

}
