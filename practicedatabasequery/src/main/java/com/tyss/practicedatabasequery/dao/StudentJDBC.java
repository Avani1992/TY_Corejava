package com.tyss.practicedatabasequery.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tyss.practicedatabasequery.dto.Student;

public class StudentJDBC implements StudentDAO {

	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	Statement stmt=null;
	public Student getStudentDetail(int id) {
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			Class.forName(properties.getProperty("driver"));
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			pstmt = conn.prepareStatement(properties.getProperty("squery"));
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			Student stu=new Student();
			while(rs.next()) {
				stu.setSid(rs.getInt("sid"));
				stu.setSname(rs.getString("sname"));
				stu.setStd(rs.getInt("std"));
				stu.setStream(rs.getString("Stream"));
				stu.setDob(rs.getDate("dob"));
			}
			return stu;
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}finally {
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
		}
		
	}

	public List<Student> getAllStudentDetail() {
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			Class.forName(properties.getProperty("driver"));
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			String query="select * from student_info";
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Student> a1 = new ArrayList<Student>();
			
			while(rs.next()) {
				Student stu=new Student();
				stu.setSid(rs.getInt("sid"));
				stu.setSname(rs.getString("sname"));
				stu.setStd(rs.getInt("std"));
				stu.setStream(rs.getString("Stream"));
				stu.setDob(rs.getDate("dob"));
				a1.add(stu);
			}
			return a1;
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}finally {
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
		}
	}

	public boolean createStudentRecord(Student student) {
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			Class.forName(properties.getProperty("driver"));
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			pstmt = conn.prepareStatement(properties.getProperty("iquery"));
			student.setSid(104);
			student.setSname("Ria");
			pstmt.setInt(1, student.getSid());
			pstmt.setString(2, student.getSname());
			int i = pstmt.executeUpdate();
			if(i!=0) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	public boolean updateStudentRecord(Student student) {
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			Class.forName(properties.getProperty("driver"));
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			pstmt = conn.prepareStatement("update student_info set std=? where sid=?");
			student.setSid(101);
			student.setStd(12);
			pstmt.setInt(2, student.getSid());
			pstmt.setInt(1, student.getStd());
			int i = pstmt.executeUpdate();
			if(i!=0) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	public boolean deleteStudentRecord(int id) {
		try {
			FileInputStream inputstream=new FileInputStream("db.properties");
			Properties properties = new Properties();
			properties.load(inputstream);
			Class.forName(properties.getProperty("driver"));
			conn = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			pstmt = conn.prepareStatement("delete from student_info where sid=?");
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if(i!=0) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}finally {
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
		}
		
	}

}
