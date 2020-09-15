package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.dto.Person;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person=new Person();
		
		person.setPid(115);
		person.setName("Neha");
		person.setEmailId("Neha@gmail.com");
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
		factory=Persistence.createEntityManagerFactory("test");
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		System.out.println("Record saved");
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();
	}// End of Method

}//End of class
