package com.tyss.practicehibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.practicehibernate.onetomany.Simcard;

public class TestOneToManyRetrieve {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			Simcard sc = manager.find(Simcard.class, 10024);
			System.out.println("Simcard no= "+sc.getSid());
			System.out.println("Company name= "+sc.getCname());
			System.out.println("Person id= "+sc.getPerson().getPid());
			System.out.println("Person name= "+sc.getPerson().getName());
			System.out.println("Person email= "+sc.getPerson().getEmailId());
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		manager.close();
		factory.close();

	}
}
