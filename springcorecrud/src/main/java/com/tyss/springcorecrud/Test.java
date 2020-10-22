package com.tyss.springcorecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcorecrud.dao.DeleteRecord;
import com.tyss.springcorecrud.dao.InsertRecord;
import com.tyss.springcorecrud.dao.RetrieveRecord;
import com.tyss.springcorecrud.dao.UpdateRecord;
import com.tyss.springcorecrud.dto.Person;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Person person=new Person();
		
		/*RetrieveRecord record = context.getBean(RetrieveRecord.class);
		Person detail = record.getPersonDetail(103);
		System.out.println(detail);*/
		
		// Insert record
		
		/*InsertRecord record = context.getBean(InsertRecord.class);
		person.setId(103);
		person.setName("Pooja");
		person.setEmail("Pooja@gmail.com");
		person.setAge(21);
		boolean insert = record.insertPersonDetail(person);
		System.out.println("Record inserted Successfully..");*/
		
		/*UpdateRecord record = context.getBean(UpdateRecord.class);
		person.setName("Rajvi");
		person.setId(102);
		boolean update = record.UpdatePersonDetail(person);
		System.out.println("Record updated successfully..");*/
		
		DeleteRecord record = context.getBean(DeleteRecord.class);
		boolean delete = record.DeletePersonDetail(102);
		System.out.println("Record deleted successfully..");
		
		

	}

}
