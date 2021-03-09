package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_table")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String name;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author(String name) {
		super();
		this.name = name;
	}

}
