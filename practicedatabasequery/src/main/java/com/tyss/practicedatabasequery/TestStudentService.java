package com.tyss.practicedatabasequery;

import java.util.List;

import com.tyss.practicedatabasequery.dao.StudentDAO;
import com.tyss.practicedatabasequery.dao.StudentJDBC;
import com.tyss.practicedatabasequery.dto.Student;
import com.tyss.practicedatabasequery.service.StudentService;
import com.tyss.practicedatabasequery.service.StudentServiceClass;

public class TestStudentService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService service = new StudentServiceClass();
		List<Student> record = service.getAllStudentDetail();
		
		for(Student s:record) {
			System.out.println("Student sid="+s.getSid());
			System.out.println("Student name= "+s.getSname());
			System.out.println("Student std= "+s.getStd());
			System.out.println("Student Stream= "+s.getStream());
			System.out.println("Student DOB= "+s.getDob());
			System.out.println("=================================");
			}

	}

}
