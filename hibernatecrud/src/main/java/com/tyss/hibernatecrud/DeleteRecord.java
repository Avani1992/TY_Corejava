package com.tyss.hibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernatecrud.dto.Employee;

public class DeleteRecord {

public static void main(String[] args) {
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			
			 factory=Persistence.createEntityManagerFactory("test");
			 manager = factory.createEntityManager();
			 transaction = manager.getTransaction();
			 transaction.begin();
			 Employee record = manager.find(Employee.class, 108);
			 manager.remove(record);
 			 System.out.println("Record Deleted");
			 transaction.commit();
		
			}catch (Exception e) {
					System.out.println(e.getMessage());
					transaction.rollback();
		
			}
		manager.close();
		factory.close();
	}// end of Method
}// End of class
