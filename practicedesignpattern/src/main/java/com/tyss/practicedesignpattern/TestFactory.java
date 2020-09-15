package com.tyss.practicedesignpattern;

import com.tyss.practicedesignpattern.dao.EmployeeDAO;
import com.tyss.practicedesignpattern.dao.EmployeeDAOFactory;
import com.tyss.practicedesignpattern.dto.Employee;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		Employee employee = dao.getEmployeeDetailById(123);
		System.out.println("Employee id= "+employee.getEmpId());
		System.out.println("Employee name= "+employee.getName());
		System.out.println("Employee email= "+employee.getEmail());
		System.out.println("Employee deptno= "+employee.getDeptno());
		System.out.println("============================================");
	}

}
