package org.capg.demo.dao;

import java.util.List;


import org.capg.demo.bean.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository("tDao")
public interface TraineeJpaRepository extends JpaRepository<Trainee, Integer>{
	@Query("select t from Trainee t where t.traineeName like :c%")
	public List<Trainee> findByTraineeName(@Param("c")String name);
}
