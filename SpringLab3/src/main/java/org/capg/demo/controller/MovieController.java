package org.capg.demo.controller;

import java.util.List;

import org.capg.demo.bean.Movie;
import org.capg.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieService mser;
	@GetMapping("/all")
	public List<Movie> findAllMovie(){
		return mser.findAllMovie();
	}
	@GetMapping("/{genre}")
	public List<Movie> findByGenere(@PathVariable String genre){
		return mser.findByGenere(genre);
	}
	
	@PostMapping("/create")
	public List<Movie> createMovie(@RequestBody Movie m){
		return mser.createMovie(m);
	}
	
	@DeleteMapping("/delete{name}")
	public List<Movie> removeMovie(@PathVariable String name){
		return mser.removeMovie(name);		
	}
	
	@PutMapping("/update")
	public List<Movie> updateMovie(@RequestBody Movie m){
		return mser.updateMovie(m);
	}
}
