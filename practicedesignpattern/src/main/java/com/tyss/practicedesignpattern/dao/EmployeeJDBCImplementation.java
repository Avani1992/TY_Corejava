package com.tyss.practicedesignpattern.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tyss.practicedesignpattern.dto.Employee;

public class EmployeeJDBCImplementation implements EmployeeDAO {

	Connection  conn=null;
	java.sql.PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	public Employee getEmployeeDetailById(int id) {

		try {
			FileInputStream fs=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fs);

			//1. load the driver
			Class.forName(properties.getProperty("driver"));

			//2. Get the DB connection via Driver
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			//3. Issue SQL query via Connection
			String query=properties.getProperty("squery");
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			Employee emp=new Employee();

			//4. Process the result return by SQL query
			if(rs.next()) {

				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("emailId"));
				emp.setDeptno(rs.getInt("deptno"));
				return emp;
			}else {
				return null;

			}

		}catch(Exception ex) {
			return null;
		}finally {
			//5. close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End of Finally
	}

	public List<Employee> getAllEmployeeDetail() {

		try {
			FileInputStream fs=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fs);

			//1. load the driver
			Class.forName(properties.getProperty("driver"));

			//2. Get the DB connection via Driver
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			//3. Issue SQL query via Connection
			String query=properties.getProperty("sallquery");
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query);
			
			ArrayList<Employee> l1= new ArrayList<Employee>();

			//4. Process the result return by SQL query
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("emailId"));
				emp.setDeptno(rs.getInt("deptno"));
				l1.add(emp);
				
			}return l1;

		}catch(Exception ex) {
			return null;
		}finally {
			//5. close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End of Finally
		
	}

	public boolean createEmployeeInfo(Employee employee) {
		try {
			FileInputStream fs=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fs);

			//1. load the driver
			Class.forName(properties.getProperty("driver"));

			//2. Get the DB connection via Driver
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			//3. Issue SQL query via Connection
			String query=properties.getProperty("iquery");
			pstmt = conn.prepareStatement(query);
			employee.setEmpId(123);
			pstmt.setInt(1, employee.getEmpId());
			
			int i = pstmt.executeUpdate();

			//4. Process the result return by SQL query
			if(i==1) {

				return true;
			}else {
				return false;

			}

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			//5. close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End of Finally
		
	}

	public boolean deleteEmployeeDetail(int id) {
		try {
			FileInputStream fs=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fs);

			//1. load the driver
			Class.forName(properties.getProperty("driver"));

			//2. Get the DB connection via Driver
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			//3. Issue SQL query via Connection
			String query=properties.getProperty("dquery");
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, id);
			
			int i = pstmt.executeUpdate();

			//4. Process the result return by SQL query
			if(i==1) {

				return true;
			}else {
				return false;

			}

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			//5. close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End of Finally
	}

	public boolean updateEmployeeDetail(Employee employee) {
		try {
			FileInputStream fs=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(fs);

			//1. load the driver
			Class.forName(properties.getProperty("driver"));

			//2. Get the DB connection via Driver
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			//3. Issue SQL query via Connection
			String query=properties.getProperty("uquery");
			pstmt = conn.prepareStatement(query);
			employee.setEmpId(145);
			employee.setName("Akshit");
			pstmt.setString(1, employee.getName());
			pstmt.setInt(2, employee.getEmpId());
			
			int i = pstmt.executeUpdate();

			//4. Process the result return by SQL query
			if(i==1) {

				return true;
			}else {
				return false;

			}

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			//5. close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}//End of Finally
	}

}// End of Class
