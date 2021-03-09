package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class BookMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lab2");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
//		Author a = new Author("Ulligadu");
//		Author b = new Author("Balligadu");
//		Author c = new Author("Gilligadu");
//		List<Author> li = new ArrayList<Author>();
//		li.add(a);
//		li.add(b);
//		li.add(c);
//		Book bk = new Book("Java",500,li);
//		em.persist(bk);
//		tx.commit();
//		System.out.println("=========Done=========");
		//query 1:
		Query q1= em.createQuery("select e from Book e");
		List<Book> ba= q1.getResultList();
		System.out.println("Solution 1:");
		ba.forEach(System.out::println);
//		for(Book i:ba) {
//			System.out.println(i);
//		}
		//query 2:
		Query q2 =em.createNativeQuery("select * from book_table where isbn=(select book_isbn from book_table_author_table where li_id= (select id from author_table where name=:n))",Book.class);
		q2.setParameter("n", "Ulligadu");
		List<Book> var=q2.getResultList();
		var.forEach(System.out::println);
	}

}
