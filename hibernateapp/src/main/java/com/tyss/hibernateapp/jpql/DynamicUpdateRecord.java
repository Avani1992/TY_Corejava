package com.tyss.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateRecord {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			
			 factory=Persistence.createEntityManagerFactory("test");
			 manager = factory.createEntityManager();
			 transaction = manager.getTransaction();
			 transaction.begin();
			 String jpql="update Person p set p.name=:nm where p.pid=:id";
			 Query query = manager.createQuery(jpql);
			 query.setParameter("id", 101);
			 query.setParameter("nm", "Sonam");
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
