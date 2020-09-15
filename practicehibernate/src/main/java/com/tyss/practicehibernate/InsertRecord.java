package com.tyss.practicehibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.practicehibernate.dto.Student;

public class InsertRecord  {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.setSid(1001);
		stu.setName("Richa");
		stu.setEmailId("Richa@gmail.com");
		stu.setStd(12);
		stu.setStream("Science");

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(stu);
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
