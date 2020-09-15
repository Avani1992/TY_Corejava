package com.tyss.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.tyss.hibernateapp.dto.Person;
public class UpdateRecord {

	public static void main(String[] args) {
		
	
	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
	try {
		
		 factory=Persistence.createEntityManagerFactory("test");
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		 transaction.begin();
		 String jpql="update Person p set p.name='Hema' where p.pid=101";
		 Query query = manager.createQuery(jpql);
		 int update = query.executeUpdate();
		 System.out.println("Record updated= "+update);
		
		 transaction.commit();
	
		}catch (Exception e) {
				System.out.println(e.getMessage());
				transaction.rollback();
	
		}
	manager.close();
	factory.close();
	}
}
