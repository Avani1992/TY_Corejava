package com.tyss.practicedatabasequery.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class StudentDAOFactory  {
	
	private static  StudentDAOFactory s1=null;
	static StudentDAO dao=null;
	
	private StudentDAOFactory() {}
	
	public static StudentDAO getInstance() {
		
		FileInputStream inputstream=null;
		try {
			inputstream = new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			if(properties.getProperty("dbtype").equals("jdbc")) {
				dao=new StudentJDBC();
			}else {
				dao=new StudentHibernate();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dao;
		
	}
	

}
