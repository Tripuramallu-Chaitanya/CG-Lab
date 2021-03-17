package org.capg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Movie {
	@Id
	private String name;
	private float rating;
	private String genre;
	public Movie(String name, float rating, String genre) {
		super();
		this.name = name;
		this.rating = rating;
		this.genre = genre;
	}
	public Movie() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
