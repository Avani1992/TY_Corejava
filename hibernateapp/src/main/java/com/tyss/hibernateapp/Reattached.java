package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.dto.Person;

public class Reattached {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Person record = manager.find(Person.class, 101);
			System.out.println("Record attached= "+manager.contains(record));
			manager.detach(record);
			System.out.println("Record attached= "+manager.contains(record));
			record.setEmailId("Ruhil@gmail.com");
			Person per = manager.merge(record);
			per.setEmailId("Ruhil@gmail.com");
			System.out.println("Record Updated.");
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();

	}
}
