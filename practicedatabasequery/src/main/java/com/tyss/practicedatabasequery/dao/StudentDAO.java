package com.tyss.practicedatabasequery.dao;

import java.util.List;

import com.tyss.practicedatabasequery.dto.Student;

public interface StudentDAO {

	public Student getStudentDetail(int id);
	public List<Student> getAllStudentDetail();
	public boolean createStudentRecord(Student student);
	public boolean updateStudentRecord(Student student);
	public boolean deleteStudentRecord(int id);
}
