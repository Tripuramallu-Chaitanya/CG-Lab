package org.capg.demo.controller;

import java.util.List;

import org.capg.demo.bean.Trainee;
import org.capg.demo.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	@Autowired
	TraineeService tser;
	@PostMapping("/create")
	public List<Trainee> create(@RequestBody Trainee t){
		return tser.createTrainee(t);
	}
	@GetMapping("/all")
	public List<Trainee> printAll(){
		return tser.printAll();
	}
	@DeleteMapping("/delete/{id}")
	public List<Trainee> delete(@PathVariable int id){
		tser.delete(id);
		return tser.printAll();
	}
	@PutMapping("/update")
	public List<Trainee> update(@RequestBody Trainee t){
		tser.update(t);
		return tser.printAll();
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Trainee> printAll(@PathVariable int id){
		Trainee t = tser.find(id);
		if(t!=null)
			return new ResponseEntity<Trainee>(t, HttpStatus.OK);
		else
			return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("/name/{name}")
	public List<Trainee> findByName(@PathVariable String name){
		return tser.findByName(name);
	}
}
