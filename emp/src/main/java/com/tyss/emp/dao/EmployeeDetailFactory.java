package com.tyss.emp.dao;



public class EmployeeDetailFactory {
	
	private EmployeeDetailFactory() {}

	static EmployeeDetailDAO dao=null;
	public static String dbType="jdbc";
	
	public static EmployeeDetailDAO getInstance() {
		 if(dbType.equals("jdbc")) {
			 dao=new EmployeeDetailJDBCImplementation();
		 }else {
			 dao=new EmployeeDetailHibernateImplementation();
		 }
		return dao;
		
	}//End of Method
}//End of class
