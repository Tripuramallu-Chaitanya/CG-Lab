package com.cg.eis.config;
import java.util.*;
import com.cg.eis.bean.Employee;
public class EmployeeData{
	static Map <Integer,Employee> nameMap = new HashMap<Integer,Employee>();
	static {
		nameMap.put(101,new Employee(101,"Chaitu",54000,"Manager"));
		nameMap.put(102,new Employee(102,"Vamshi",35000,"Programmer"));
		nameMap.put(103,new Employee(103,"Pavan",18000,"SystemAssociate"));
		nameMap.put(104,new Employee(104,"Groot",4000,"Clerk"));
	}
	public static Map<Integer, Employee> getEmpMap(){
		return nameMap;
	}
}