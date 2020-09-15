package com.tyss.practicedesignpattern;

import com.tyss.practicedesignpattern.dto.Employee;
import com.tyss.practicedesignpattern.service.EmployeeSeriveClass;

public class TestService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeSeriveClass service = new EmployeeSeriveClass();
		Employee employee = service.getEmployeeDetailById(123);
		System.out.println("Employee id= "+employee.getEmpId());
		System.out.println("Employee name= "+employee.getName());
		System.out.println("Employee email= "+employee.getEmail());
		System.out.println("Employee deptno= "+employee.getDeptno());
		System.out.println("============================================");

	}

}
