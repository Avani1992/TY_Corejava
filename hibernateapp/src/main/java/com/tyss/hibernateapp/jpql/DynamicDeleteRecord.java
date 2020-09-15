package com.tyss.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql="delete from Person p where p.pid=:id";
			Query query = manager.createQuery(jpql);
			query.setParameter("id", 102);
			
			int delete = query.executeUpdate();
			System.out.println("Record Deleted "+delete);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		manager.close();
		factory.close();
		

	}

}
