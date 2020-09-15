package com.tyss.practicedatabasequery;

import com.tyss.practicedatabasequery.dao.StudentDAO;
import com.tyss.practicedatabasequery.dao.StudentDAOFactory;
import com.tyss.practicedatabasequery.dto.Student;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		StudentDAO dao = StudentDAOFactory.getInstance();
		boolean insert = dao.createStudentRecord(student);
		System.out.println("Record inserted "+insert);

	}

}
