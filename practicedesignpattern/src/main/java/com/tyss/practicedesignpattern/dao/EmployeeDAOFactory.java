package com.tyss.practicedesignpattern.dao;

import java.io.FileInputStream;
import java.util.Properties;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {}
	
	private static String dbInteractionType="";
	
	static EmployeeDAO dao=null;
	
	public static EmployeeDAO getInstance() {

		try {
			FileInputStream fs=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fs);
			dbInteractionType=properties.getProperty("dbtype");

			if(dbInteractionType.equals("jdbc")) {
				dao=new EmployeeJDBCImplementation();
			}else if(dbInteractionType.equals("hibernate")) {
				dao=new EmployeeHibernateImplementation();
			}else {

			}

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return dao;
	}

}
