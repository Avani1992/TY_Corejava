package com.tyss.hibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.manytoone.Pencil;
import com.tyss.hibernateapp.manytoone.PencilBox;

public class TestOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PencilBox b=new PencilBox();
		b.setBid(11);
		b.setBname("Apsara");

		Pencil pen=new Pencil();
		pen.setPid(3);
		pen.setName("Pensil3");
		pen.setBox(b);

		Pencil pen1=new Pencil();
		pen.setPid(4);
		pen.setName("Pensil4");
		pen.setBox(b);

		ArrayList<Pencil> arrayList = new ArrayList<Pencil>();
		arrayList.add(pen);
		arrayList.add(pen1);


		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			PencilBox box1 = manager.find(PencilBox.class, 11);

			System.out.println("Name= "+box1.getPencil().get(0).getName());


			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		manager.close();
		factory.close();
	}

}
