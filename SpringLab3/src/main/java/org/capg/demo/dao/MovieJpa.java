package org.capg.demo.dao;

import java.util.List;

import org.capg.demo.bean.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MovieJpa extends JpaRepository<Movie, String>{
	public List<Movie> findByGenre(String genre);
}
