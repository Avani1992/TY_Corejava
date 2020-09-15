package com.tyss.practicehibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tyss.practicehibernate.dto.Student;

public class TestSingleRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String query="select s from Student s where s.sid=1001";
		TypedQuery<Student> squery = manager.createQuery(query, Student.class);
		Student result = squery.getSingleResult();
		System.out.println("Student id= "+result.getSid());
		System.out.println("Student name= "+result.getName());
		System.out.println("Student emailId= "+result.getEmailId());
		System.out.println("Student std= "+result.getStd());
		System.out.println("Student stream= "+result.getStream());





	}

}
