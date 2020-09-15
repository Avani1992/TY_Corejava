package com.tyss.practicehibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.practicehibernate.onetoone.Employee;

public class TestOneToOneUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			Employee record = manager.find(Employee.class, 1001);
			record.setName("Riya");
			manager.persist(record);
			
			System.out.println("Record updated");
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();

	}
}

