package com.tyss.springcorecrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.tyss.springcorecrud.dto.Person;

@Component
public class DeleteRecord {

	public boolean DeletePersonDetail(int id){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String query="delete from Person p where p.id=:id";
		Query delete = manager.createQuery(query);
		delete.setParameter("id", id);
		delete.executeUpdate();
		transaction.commit();
		manager.close();
		return true;
	}
}
