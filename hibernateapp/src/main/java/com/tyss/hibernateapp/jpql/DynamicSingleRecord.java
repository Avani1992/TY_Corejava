package com.tyss.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tyss.hibernateapp.dto.Person;

public class DynamicSingleRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql="select p from Person p where p.pid=:id";
		//Query query = manager.createQuery(jpql);
		
		TypedQuery<Person> query = manager.createQuery(jpql, Person.class);
		query.setParameter("id", 101);
		Person p = query.getSingleResult();
			System.out.println("Id= "+p.getPid());
			 System.out.println("Name= "+p.getName());
			 System.out.println("EmailId= "+p.getEmailId());
			 System.out.println("---------------------------");
		
	}
}
