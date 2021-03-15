package org.capg.controller;

import java.util.List;

import org.capg.bean.Employee;
import org.capg.dao.EmployeeDao;
import org.capg.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController is @Controller + @ResponseBody
@RequestMapping("/employee")
public class MyController {
	@Autowired
	EmployeeService eser;
	//@RequestMapping("/all")
	@GetMapping(value="/all"/*,produces=MediaType.APPLICATION_JSON_VALUE*/)
	public List<Employee> printAllEmployee() {
		return eser.printAllEmployee();
	}
	@GetMapping("/find{empid}")
	public ResponseEntity<Employee> findEmployee(@PathVariable int empid) {
		Employee e = eser.findEmployee(empid);
		if(e!=null)
			return new ResponseEntity<Employee>(e, HttpStatus.OK);
		else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	//@PostMapping(value="/create"/*, consumes=MediaType.APPLICATION_JSON_VALUE*/)
	@PostMapping
	public List<Employee> saveEmployee(@RequestBody Employee emp) {
		return eser.createEmployee(emp);
		
	}
	@DeleteMapping("/{empid}")
	public List<Employee> deleteEmployee(@PathVariable int empid) {
		return eser.deleteEmployee(empid);
	}
	
	@PutMapping
	public List<Employee> updateEmployee(@RequestBody Employee emp){
		return eser.updateEmployee(emp);
	}
}
