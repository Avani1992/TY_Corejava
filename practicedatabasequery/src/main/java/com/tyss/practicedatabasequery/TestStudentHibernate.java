package com.tyss.practicedatabasequery;

import java.util.List;

import com.tyss.practicedatabasequery.dao.StudentDAO;
import com.tyss.practicedatabasequery.dao.StudentHibernate;
import com.tyss.practicedatabasequery.dto.Student;

public class TestStudentHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		StudentDAO dao = new StudentHibernate();
		//boolean insert = dao.createStudentRecord(student);
		//System.out.println("Record inserted. "+insert);

		// Fetch Single Student Record.
		//		Student record = dao.getStudentDetail(102);
		//		System.out.println("Student sid="+record.getSid());
		//		System.out.println("Student name= "+record.getSname());
		//		System.out.println("Student std= "+record.getStd());
		//		System.out.println("Student Stream= "+record.getStream());
		//		System.out.println("Student DOB= "+record.getDob());

		// Fetch All Student Record
		//		List<Student> record = dao.getAllStudentDetail();
		//		for(Student s:record) {
		//			System.out.println("Student sid="+s.getSid());
		//			System.out.println("Student name= "+s.getSname());
		//			System.out.println("Student std= "+s.getStd());
		//			System.out.println("Student Stream= "+s.getStream());
		//			System.out.println("Student DOB= "+s.getDob());
		//			System.out.println("=================================");
		//			}

		boolean update = dao.updateStudentRecord(student);
		System.out.println("Record updated "+update);

		// delete record
		boolean delete = dao.deleteStudentRecord(104);
		System.out.println("Record deleted "+delete);

	}

}
