package com.tyss.hibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernateapp.dto.Person;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql="select p from Person p";
		//Query query = manager.createQuery(jpql);
		
		TypedQuery<Person> query = manager.createQuery(jpql, Person.class);
		List<Person> record = query.getResultList();
		for(Person p:record) {
			System.out.println("Id= "+p.getPid());
			 System.out.println("Name= "+p.getName());
			 System.out.println("EmailId= "+p.getEmailId());
			 System.out.println("---------------------------");
		}
	}

}
