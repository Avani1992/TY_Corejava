package com.tyss.springcorecrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.tyss.springcorecrud.dto.Person;

@Component
public class InsertRecord {

	public boolean insertPersonDetail(Person person){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		manager.close();
		return true;
	}




}
