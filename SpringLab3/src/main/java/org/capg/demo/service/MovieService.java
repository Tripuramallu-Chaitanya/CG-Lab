package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Movie;
import org.capg.demo.dao.MovieJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	@Autowired
	MovieJpa mdao;
	
	public List<Movie> findAllMovie(){
		return mdao.findAll();
	}
	
	public List<Movie> findByGenere(String genre){
		return mdao.findByGenre(genre);
	}
	
	public List<Movie> createMovie(Movie m){
		mdao.saveAndFlush(m);
		return mdao.findAll();
	}
	
	public List<Movie> removeMovie(String name){
		mdao.deleteById(name);
		return mdao.findAll();		
	}
	public List<Movie> updateMovie(Movie m){
		mdao.saveAndFlush(m);
		return mdao.findAll();
	}
}
