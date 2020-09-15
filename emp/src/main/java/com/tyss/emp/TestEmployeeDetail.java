package com.tyss.emp;

import java.util.List;
import java.util.Scanner;

import com.tyss.emp.dao.EmployeeDetailDAO;
import com.tyss.emp.dao.EmployeeDetailJDBCImplementation;
import com.tyss.emp.dto.EmployeeDetail;
import com.tyss.emp.service.EmployeeDetailService;
import com.tyss.emp.service.EmployeeDetailServiceClass;

public class TestEmployeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EmployeeDetailService service = new EmployeeDetailServiceClass();
		EmployeeDetail emp = new EmployeeDetail();

		/*Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Emp detail");
		System.out.println("Enter eid: ");
		emp.setEid(sc.nextInt());
		System.out.println("Enter name: ");
		emp.setName(sc.next());
		System.out.println("Enter age: ");
		emp.setAge(sc.nextInt());
		System.out.println("Enter DOB: ");
		emp.setDob(sc.next());
		System.out.println("Enter Email: ");
		emp.setEmail(sc.next());
		System.out.println("Enter MobileNo: ");
		emp.setMobileno(sc.nextLong());
		System.out.println("Enter Salary: ");
		emp.setSalary(sc.nextDouble());
		System.out.println("enter DOJ: ");
		emp.setDoj(sc.next());
		System.out.println("enter Designation: ");
		emp.setDesignation(sc.next());
		System.out.println("Enter deptno: ");
		emp.setDeptno(sc.nextInt());


		boolean insert = service.createEmpRecord(emp);
		System.out.println("Record inserted. "+insert);

		// Fetch all record
		List<EmployeeDetail> record = service.getAllEmpDetail();
		for(EmployeeDetail e:record) {
			System.out.println(e.getEid());
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println(e.getDob());
			System.out.println(e.getEmail());
			System.out.println(e.getMobileno());
			System.out.println(e.getSalary());
			System.out.println(e.getDoj());
			System.out.println(e.getDesignation());
			System.out.println(e.getDeptno());
			System.out.println("==================================");

		}*/

		// Fetch single record

		EmployeeDetail rec = service.getEmpDetail(102);

		System.out.println(rec.getEid());
		System.out.println(rec.getName());
		System.out.println(rec.getAge());
		System.out.println(rec.getDob());
		System.out.println(rec.getEmail());
		System.out.println(rec.getMobileno());
		System.out.println(rec.getSalary());
		System.out.println(rec.getDoj());
		System.out.println(rec.getDesignation());
		System.out.println(rec.getDeptno());

		// update record
		/*emp.setSalary(35000);
		emp.setEid(102);
		boolean update = service.updateEmpRecord(emp);
		System.out.println("Record updated "+update);

		//delete record
		boolean delete = service.deleteEmpRecord(101);
		System.out.println("Record deleted "+delete);

*/



	}

}
