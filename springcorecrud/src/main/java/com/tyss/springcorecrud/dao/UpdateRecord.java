package com.tyss.springcorecrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.tyss.springcorecrud.dto.Person;

@Component
public class UpdateRecord {

	public boolean UpdatePersonDetail(Person person){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String query="update Person p set p.name=:name where p.id=:id";
		Query update = manager.createQuery(query);
		update.setParameter("name", person.getName());
		update.setParameter("id", person.getId());
		int i = update.executeUpdate();
		transaction.commit();
		manager.close();
		return true;
	}
}
