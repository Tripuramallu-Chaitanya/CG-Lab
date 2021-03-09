package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ISBN;
	private String title;
	private int price;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Author> li;
	
	
	public List<Author> getLi() {
		return li;
	}
	public void setLi(List<Author> li) {
		this.li = li;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book() {
		
	}
	public Book(String title, int price, List<Author> li) {
		super();
		this.title = title;
		this.price = price;
		this.li = li;
	}
	public String toString() {
		return this.ISBN+"\t"+this.title+"\t"+this.price;
	}
	
}
