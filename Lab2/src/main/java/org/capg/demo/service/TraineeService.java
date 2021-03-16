package org.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Trainee;
import org.capg.demo.dao.TraineeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tser")
public class TraineeService {
	@Autowired
	TraineeJpaRepository tDao;
	
	public List<Trainee> createTrainee(Trainee t){
		tDao.saveAndFlush(t);
		return tDao.findAll();
	}

	public List<Trainee> printAll(){
		return tDao.findAll();
	}
	
	public List<Trainee> delete(int id){
		tDao.deleteById(id);
		return tDao.findAll();
	}
	
	public List<Trainee> update(Trainee t){
		tDao.saveAndFlush(t);
		return tDao.findAll();
	}
	
	public Trainee find(int id){
		Optional<Trainee> op = tDao.findById(id);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
	
	public List<Trainee> findByName(String name){
		return tDao.findByTraineeName(name);
	}
}
