package com.tyss.practicehibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tyss.practicehibernate.dto.Student;



public class GetAllRecord {

	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	EntityManager manager = factory.createEntityManager();
	String jpql="select s from Student_info s";

	
	TypedQuery<Student> query = manager.createQuery(jpql, Student.class);
	List<Student> record = query.getResultList();
	for(Student s1:record) {
		System.out.println("Student id= "+s1.getSid());
		System.out.println("Student name= "+s1.getName());
		System.out.println("Student emailId= "+s1.getEmailId());
		System.out.println("Student std= "+s1.getStd());
		System.out.println("Student stream= "+s1.getStream());
	}
	}
}
