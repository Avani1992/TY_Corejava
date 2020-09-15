package com.tyss.practicehibernate;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.practicehibernate.onetomany.Person;
import com.tyss.practicehibernate.onetomany.Simcard;


public class TestOneToMany {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setPid(1);
		p.setName("Kuman");
		p.setEmailId("Kuman@gmail.com");
		
		
		Simcard simcard = new Simcard();
		simcard.setSid(10024);
		simcard.setCname("Airtel");
		simcard.setPerson(p);
		
		
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(simcard);
			System.out.println("Data saved");
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();

	}

}
