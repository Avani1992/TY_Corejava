package com.tyss.designpattern;

import com.tyss.designpattern.dao.PersonDAO;
import com.tyss.designpattern.dao.PersonDAOFactory;
import com.tyss.designpattern.dao.PersonHibernate;
import com.tyss.designpattern.dao.PersonJDBCImplementation;
import com.tyss.designpattern.dto.Person;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PersonJDBCImplementation jdbc = new PersonJDBCImplementation();
		//Person record = jdbc.getPersonDetailById(101);
		
		//PersonHibernate hibernate = new PersonHibernate();
		//Person record = hibernate.getPersonDetailById(101);
		PersonDAO person = PersonDAOFactory.getInstance();  // Factory design pattern
		Person record = person.getPersonDetailById(101);
		System.out.println("Id= "+record.getPid());
		System.out.println("Name= "+record.getName());
		System.out.println("EmailId= "+record.getEmailId());
		System.out.println("=========================");
		
		

	}

}
