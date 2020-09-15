package com.tyss.practicehibernate;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.practicehibernate.onetoone.Department;
import com.tyss.practicehibernate.onetoone.Employee;

public class TestOneToOneRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=null;
		EntityManager manager=null;
	
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			
			Employee record = manager.find(Employee.class, 1001);
			System.out.println("EmpId= "+record.getEmpID());
			System.out.println("Name= "+record.getName());
			System.out.println("JoiningDate= "+record.getJdate());
			System.out.println("Salary= "+record.getSalary());
			System.out.println("DeptId= "+record.getDept().getDeptID());
			System.out.println("Deptname= "+record.getDept().getDname());
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		manager.close();
		factory.close();

	}
}
