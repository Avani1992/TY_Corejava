package com.tyss.practicedesignpattern.dao;

import java.util.List;

import com.tyss.practicedesignpattern.dto.Employee;

public interface EmployeeDAO {

	public Employee getEmployeeDetailById(int id);
	public List<Employee> getAllEmployeeDetail();
	public boolean createEmployeeInfo(Employee employee);
	public boolean deleteEmployeeDetail(int id);
	public boolean updateEmployeeDetail(Employee employee);
}// End of Interface
