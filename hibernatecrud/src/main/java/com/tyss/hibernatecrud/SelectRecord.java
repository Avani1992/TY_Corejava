package com.tyss.hibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.tyss.hibernatecrud.dto.Employee;

public class SelectRecord {

	public static void main(String[] args) {
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		 EntityManager manager = factory.createEntityManager();
		 Employee record = manager.find(Employee.class, 108);
		 System.out.println("EmployeeId= "+record.getEmpId());
		 System.out.println("EmployeeName= "+record.getName());
		 System.out.println("EmployeeDOB= "+record.getDate());
		 System.out.println("EmployeeEmailId= "+record.getEmail());
		 System.out.println("EmployeeDeptNo= "+record.getDeptno());
		 System.out.println("EmployeeDesignation= "+record.getDesignation());
		 System.out.println("EmployeeDOJ= "+record.getJdate());
		 System.out.println("EmployeeManagerId= "+record.getMid());
		 System.out.println("EmployeeSalary= "+record.getSalary());
		 System.out.println("EmployeeAge= "+record.getAge());
		 manager.close();
		 factory.close();
	}// End of Method
}// end of class
