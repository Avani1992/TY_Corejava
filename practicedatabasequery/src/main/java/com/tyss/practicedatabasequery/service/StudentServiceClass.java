package com.tyss.practicedatabasequery.service;

import java.util.List;

import com.tyss.practicedatabasequery.dao.StudentDAO;
import com.tyss.practicedatabasequery.dao.StudentJDBC;
import com.tyss.practicedatabasequery.dto.Student;

public class StudentServiceClass implements StudentService {

	StudentDAO dao=new StudentJDBC();
	public Student getStudentDetail(int id) {
		// TODO Auto-generated method stub
		return dao.getStudentDetail(id);
	}

	public List<Student> getAllStudentDetail() {
		// TODO Auto-generated method stub
		return dao.getAllStudentDetail();
	}

	public boolean createStudentRecord(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudentRecord(student);
	}

	public boolean updateStudentRecord(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudentRecord(student);
	}

	public boolean deleteStudentRecord(int id) {
		// TODO Auto-generated method stub
		return dao.deleteStudentRecord(id);
	}

}
