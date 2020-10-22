package com.tyss.springcorecrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.tyss.springcorecrud.dto.Person;


@Component
public class RetrieveRecord {
	
	public Person getPersonDetail(int id){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		Person record = manager.find(Person.class, id);
		return record;
	}

}
