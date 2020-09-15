package com.tyss.practicedesignpattern.service;

import java.util.List;

import com.tyss.practicedesignpattern.dao.EmployeeDAO;
import com.tyss.practicedesignpattern.dao.EmployeeJDBCImplementation;
import com.tyss.practicedesignpattern.dto.Employee;

public class EmployeeSeriveClass implements EmployeeService {

	EmployeeDAO dao;
	public Employee getEmployeeDetailById(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailById(id);
	}

	public List<Employee> getAllEmployeeDetail() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeDetail();
	}

	public boolean createEmployeeInfo(Employee employee) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(employee);
	}

	public boolean deleteEmployeeDetail(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeDetail(id);
	}

	public boolean updateEmployeeDetail(Employee employee) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeDetail(employee);
	}

}
