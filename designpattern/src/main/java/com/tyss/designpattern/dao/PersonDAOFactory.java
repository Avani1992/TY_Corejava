package com.tyss.designpattern.dao;

public class PersonDAOFactory {

	private PersonDAOFactory() {}
	
	private static String dbInteractionType="jdbc";
	
	public static PersonDAO getInstance() {
		PersonDAO dao=null;
		if(dbInteractionType.equals("jdbc")) {
			dao=new PersonJDBCImplementation();
			
		}else if(dbInteractionType.equals("hibernate")) {
			dao=new PersonHibernate();
			
		}else {
			dao=null;
		}
		return dao;
	}
}
