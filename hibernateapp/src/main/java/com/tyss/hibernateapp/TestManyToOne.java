package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.manytoone.Pencil;
import com.tyss.hibernateapp.manytoone.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {
		
		PencilBox b=new PencilBox();
		b.setBid(11);
		b.setBname("Apsara");
		
		Pencil pen=new Pencil();
		pen.setPid(2);
		pen.setName("Pensil1");
		pen.setBox(b);
		
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
		factory=Persistence.createEntityManagerFactory("test");
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		transaction.begin();
		PencilBox box1 = manager.find(PencilBox.class, 11);// fetch record for add second record 
		pen.setBox(box1);// set second record
		manager.persist(pen);
		System.out.println("Record saved");
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();
	}// End of Method

}//End of class
	

