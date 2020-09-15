package com.tyss.practicedatabasequery;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.practicedatabasequery.manytomany.Product;
import com.tyss.practicedatabasequery.manytomany.customer;

public class TestManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product();
		p1.setPid(101);
		p1.setPname("Laptop");
		
		Product p2 = new Product();
		p2.setPid(102);
		p2.setPname("Mobile");
		
		Product p3 = new Product();
		p3.setPid(103);
		p3.setPname("HardDrive");
		
		Product p4 = new Product();
		p4.setPid(104);
		p4.setPname("Keyboard");
		
		ArrayList<Product> a1 = new ArrayList<Product>();
		a1.add(p1);
		a1.add(p2);
		customer c1 = new customer();
		c1.setCid(1);
		c1.setCname("Raja");
		c1.setProduct(a1);
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(c1);
			
			System.out.println("Record saved");
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();


	}

}
