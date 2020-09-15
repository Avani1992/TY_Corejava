package com.tyss.practicehibernate;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.tyss.practicehibernate.onetoone.Department;
import com.tyss.practicehibernate.onetoone.Employee;

public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department depart = new Department();
		depart.setDeptID(20);
		depart.setDname("Developer");

		Employee emp=new Employee();
		emp.setEmpID(1002);
		emp.setName("Hiya");
		emp.setJdate(Date.valueOf("1999-09-07"));
		emp.setSalary(76000);
		emp.setDept(depart);


		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
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
