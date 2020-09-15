package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.onetoone.User;
import com.tyss.hibernateapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VoterCard v = new VoterCard();
		v.setVid(101);
		v.setVname("Ruchi");
		
		User u = new User();
		u.setUid(1);
		u.setName("Ruchi");
		u.setVcard(v);
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
		factory=Persistence.createEntityManagerFactory("test");
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(u);
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

	


