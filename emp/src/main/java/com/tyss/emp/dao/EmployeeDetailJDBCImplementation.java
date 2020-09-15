package com.tyss.emp.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tyss.emp.dto.EmployeeDetail;


public class EmployeeDetailJDBCImplementation implements EmployeeDetailDAO {

	public EmployeeDetail getEmpDetail(int id) {
		try(FileInputStream inputstream=new FileInputStream("db.properties")){

			Properties properties = new Properties();
			properties.load(inputstream);
			try(Connection conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("squery"))) {
				Class.forName(properties.getProperty("driver"));
				pstmt.setInt(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					EmployeeDetail emp=new EmployeeDetail();
					while(rs.next()) {
						emp.setEid(rs.getInt(1));
						emp.setName(rs.getString(2));
						emp.setAge(rs.getInt(3));
						emp.setDob(rs.getString(4));
						emp.setEmail(rs.getString(5));
						emp.setMobileno(rs.getLong(6));
						emp.setSalary(rs.getDouble(7));
						emp.setDoj(rs.getString(8));
						emp.setDesignation(rs.getString(9));
						emp.setDeptno(rs.getInt(10));
					}
					return emp;

				}}}catch(Exception ex) {
					System.out.println(ex.getMessage());
					return null;
				}
	}// End of Method

	public List<EmployeeDetail> getAllEmpDetail() {
		try(FileInputStream inputstream=new FileInputStream("db.properties")){

			Properties properties = new Properties();
			properties.load(inputstream);
			String query="select * from employee_primaryinfo";
			try(Connection conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);Statement stmt = conn.createStatement();ResultSet rs = stmt.executeQuery(query)) {
				Class.forName(properties.getProperty("driver"));
				ArrayList<EmployeeDetail> a1 = new ArrayList<EmployeeDetail>();

				while(rs.next()) {
					EmployeeDetail emp=new EmployeeDetail();
					emp.setEid(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setAge(rs.getInt(3));
					emp.setDob(rs.getString(4));
					emp.setEmail(rs.getString(5));
					emp.setMobileno(rs.getLong(6));
					emp.setSalary(rs.getDouble(7));
					emp.setDoj(rs.getString(8));
					emp.setDesignation(rs.getString(9));
					emp.setDeptno(rs.getInt(10));
					a1.add(emp);
				}
				return a1;

			}}catch(Exception ex) {
				System.out.println(ex.getMessage());
				return null;
			}
	}// End of Method

	public boolean createEmpRecord(EmployeeDetail emp) {
		try(FileInputStream inputstream=new FileInputStream("db.properties")){

			Properties properties = new Properties();
			properties.load(inputstream);
			try(Connection conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);PreparedStatement pstmt = conn.prepareStatement(properties.getProperty("iquery"))) {
				Class.forName(properties.getProperty("driver"));

				pstmt.setInt(1, emp.getEid());
				pstmt.setString(2, emp.getName());
				pstmt.setInt(3, emp.getAge());
				pstmt.setString(4, emp.getDob());
				pstmt.setString(5, emp.getEmail());
				pstmt.setLong(6, emp.getMobileno());
				pstmt.setDouble(7, emp.getSalary());
				pstmt.setString(8, emp.getDoj());
				pstmt.setString(9, emp.getDesignation());
				pstmt.setInt(10, emp.getDeptno());

				int i = pstmt.executeUpdate();
				if(i!=0) {
					return true;
				}else {
					return false;
				}

			}}catch(Exception ex) {
				System.out.println(ex.getMessage());
				return false;
			}

	}// End of Method

	public boolean updateEmpRecord(EmployeeDetail emp) {
		try(FileInputStream inputstream=new FileInputStream("db.properties")){

			Properties properties = new Properties();
			properties.load(inputstream);
			String query="update employee_primaryinfo set salary=? where eid=?";
			try(Connection conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);PreparedStatement pstmt = conn.prepareStatement(query)) {
				Class.forName(properties.getProperty("driver"));
				pstmt.setDouble(1, emp.getSalary());
				pstmt.setInt(2, emp.getEid());
				
				int i = pstmt.executeUpdate();
				if(i!=0) {
					return true;
				}else {
					return false;
				}

				}}catch(Exception ex) {
				System.out.println(ex.getMessage());
				return false;
			}

	}// End of Method

	public boolean deleteEmpRecord(int id) {
		try(FileInputStream inputstream=new FileInputStream("db.properties")){

			Properties properties = new Properties();
			properties.load(inputstream);
			String query="delete from  employee_primaryinfo where eid=?";
			try(Connection conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);PreparedStatement pstmt = conn.prepareStatement(query)) {
				Class.forName(properties.getProperty("driver"));
				pstmt.setInt(1, id);
				
				int i = pstmt.executeUpdate();
				if(i!=0) {
					return true;
				}else {
					return false;
				}

				}}catch(Exception ex) {
				System.out.println(ex.getMessage());
				return false;
			}
	}// End of Method
}// End of Class
