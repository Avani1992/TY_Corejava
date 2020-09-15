package com.tyss.hibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.manytomany.Course;
import com.tyss.hibernateapp.manytomany.Student1;

public class TestManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setCid(10);
		course.setCname("Java");

		Course course1 = new Course();
		course1.setCid(20);
		course1.setCname("Sql");

		ArrayList<Course> a1 = new ArrayList<Course>();
		a1.add(course);
		a1.add(course1);
		
		Student1 stu1 = new Student1();
		stu1.setSid(101);
		stu1.setSname("Raj");
		stu1.setCourse(a1);

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(stu1);
			System.out.println("Record saved");
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();


	}

}
