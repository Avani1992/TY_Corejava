package com.tyss.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertRecord {

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
			//String jpql="insert into Person p p.pid=:id,p.name=:nm,p.emailId=:email";
			//String jpql="insert into Person p values(:id,:nm,:email)";
			String jpql="insert into Person p (p.pid,p.name,p.emailId) values(104,'diya','Diya@gmail.com')";
			Query query = manager.createQuery(jpql);
			query.setParameter("id", 104);
			query.setParameter("nm", "Diya");
			query.setParameter("email", "Diya@gmail.com");
			int insert = query.executeUpdate();
			System.out.println("Record inserted "+insert);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		manager.close();
		factory.close();
		

	}

}
