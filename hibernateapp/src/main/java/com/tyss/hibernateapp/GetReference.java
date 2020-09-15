package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.dto.Person;

public class GetReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			EntityManager manager = factory.createEntityManager();
			System.out.println("Get Reference");
			Person record = manager.getReference(Person.class, 102);
			System.out.println(record.getClass());
//			System.out.println("Id= "+record.getPid());
//			System.out.println("Name= "+record.getName());
//			System.out.println("EmailId= "+record.getEmailId());
			manager.close();
			factory.close();
	}

}
