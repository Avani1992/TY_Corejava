package com.tyss.hibernatecrud;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernatecrud.dto.Employee;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee emp=new Employee();
			emp.setEmpId(108);
			emp.setName("Rajesh");
			emp.setDate(Date.valueOf("1991-09-09"));
			emp.setEmail("Rajesh@gmail.com");
			emp.setDeptno(20);
			emp.setDesignation("SoftwareDeveloper");
			emp.setJdate(Date.valueOf("2015-07-04"));
			emp.setMid(1002);
			emp.setMobileno(9945674);
			emp.setSalary(56000);
			emp.setAge(24);
			
			EntityManagerFactory factory=null;
			EntityManager manager=null;
			EntityTransaction transaction=null;
			try {
				
				 factory=Persistence.createEntityManagerFactory("test");
				 manager = factory.createEntityManager();
				 transaction = manager.getTransaction();
				 transaction.begin();
				 manager.persist(emp);
				 System.out.println("Record inserted");
				 transaction.commit();
			
				}catch (Exception e) {
						System.out.println(e.getMessage());
						transaction.rollback();
			
				}
			manager.close();
			factory.close();
			

	}//End of Method

}// End of Class
