package com.tyss.practicedesignpattern;

import java.util.List;

import com.tyss.practicedesignpattern.dao.EmployeeDAO;
import com.tyss.practicedesignpattern.dao.EmployeeHibernateImplementation;
import com.tyss.practicedesignpattern.dto.Employee;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeHibernateImplementation();
		//		Employee record = dao.getEmployeeDetailById(101);
		
		//		System.out.println("Employee id= "+record.getEmpId());
		//		System.out.println("Employee name= "+record.getName());
		//		System.out.println("Employee email= "+record.getEmail());
		//		System.out.println("Employee deptno="+record.getDeptno());

		// all Employee detail...........
		List<Employee> emp = dao.getAllEmployeeDetail();
		for(Employee record:emp ) {
			System.out.println("Employee id= "+record.getEmpId());
			System.out.println("Employee name= "+record.getName());
			System.out.println("Employee email= "+record.getEmail());
			System.out.println("Employee deptno="+record.getDeptno());
			System.out.println("==========================================");
		}
		// Insert record
		Employee employee=new Employee();
//		boolean insert = dao.createEmployeeInfo(employee);
//		System.out.println("Record saved "+insert);
		
		// Delete Record
		//boolean delete = dao.deleteEmployeeDetail(105);
		//System.out.println("Record deleted "+delete);
		
		
		// update Record
//		boolean update = dao.updateEmployeeDetail(employee);
//		System.out.println("Record updated. "+update);
		
		
		



	}

}
