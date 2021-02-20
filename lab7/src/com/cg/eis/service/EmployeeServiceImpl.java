package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.config.EmployeeData;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Map<Integer, Employee> displayEmployee(String str) {
		Map<Integer,Employee> b =new HashMap<Integer,Employee>(EmployeeData.getEmpMap());
		Map<Integer,Employee> c =new HashMap<Integer,Employee>();
		Set<Integer>set=b.keySet();
		for(int i:set) {
			Employee emp =b.get(i);
			if(emp.getInsuranceScheme().equals(str)) {
				c.put(i, emp);
			}
		}
		return c;
	}

	@Override
	public List<Employee> showEmployee() {
		Map<Integer,Employee> b =new HashMap<Integer,Employee>(EmployeeData.getEmpMap());
		List<Employee> l = new ArrayList<Employee>();
		Set<Integer>set = b.keySet();
		for(int i:set) {
			l.add(b.get(i));
		}
		
		return l;
	}

	@Override
	public String deletion(int id) {
		Map<Integer,Employee> b =EmployeeData.getEmpMap();
		b.remove(id);
		return "Deleted Succesfully!";
	}
}
