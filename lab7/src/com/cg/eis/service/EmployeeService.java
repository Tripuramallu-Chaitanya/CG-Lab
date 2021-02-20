package com.cg.eis.service;
import com.cg.eis.bean.*;
import java.util.*;
public interface EmployeeService {
	Map<Integer, Employee> displayEmployee(String str);
	List<Employee> showEmployee();
	String deletion(int id);
}
