package com.tyss.practicedatabasequery.dao;

import java.io.FileInputStream;
import java.sql.Date;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.practicedatabasequery.dto.Student;

public class StudentHibernate implements StudentDAO {

	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
	public Student getStudentDetail(int id) {
		try {

			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			Student stu = manager.find(Student.class, id);
			manager.close();
			return stu;

		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			return null;
		}
	}

	public List<Student> getAllStudentDetail() {
		try {

			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			String query="select s from Student s";
			TypedQuery<Student> stu = manager.createQuery(query, Student.class);
			List<Student> student = stu.getResultList();
			manager.close();
			return student;

		}catch (Exception e) {
			transaction.rollback();
			System.out.println(e.getMessage());
			return null;
		}
	}

	public boolean createStudentRecord(Student student) {
		try {

			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			student.setSid(104);
			student.setSname("Raja");
			student.setStd(11);
			student.setStream("Commerce");
			student.setDob(Date.valueOf("1998-04-05"));
			manager.persist(student);
			transaction.commit();
			manager.close();
			return true;

		}catch (Exception e) {
			transaction.rollback();
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateStudentRecord(Student student) {
		try {

			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Query q1 = manager.createQuery("update Student s set s.dob=:dob where s.sid=:id");
			student.setSid(101);
			student.setDob(Date.valueOf("1997-04-05"));
			q1.setParameter("dob", student.getDob());
			q1.setParameter("id", student.getSid());
			int i = q1.executeUpdate();
			transaction.commit();
			manager.close();
			if(i==1) {
				return true;}
			else {
				return false;
			}

		}catch (Exception e) {
			transaction.rollback();
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteStudentRecord(int id) {
		try {

			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Query q1 = manager.createQuery("delete from Student s where s.sid=:id");
			
			q1.setParameter("id", id);
			int i = q1.executeUpdate();
			transaction.commit();
			manager.close();
			if(i==1) {
				return true;}
			else {
				return false;
			}

		}catch (Exception e) {
			transaction.rollback();
			System.out.println(e.getMessage());
			return false;
		}
	}


}
