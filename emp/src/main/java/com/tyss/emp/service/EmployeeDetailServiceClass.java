package com.tyss.emp.service;

import java.util.List;

import com.tyss.emp.dao.EmployeeDetailDAO;
import com.tyss.emp.dao.EmployeeDetailFactory;
import com.tyss.emp.dao.EmployeeDetailHibernateImplementation;
import com.tyss.emp.dao.EmployeeDetailJDBCImplementation;
import com.tyss.emp.dto.EmployeeDetail;

public class EmployeeDetailServiceClass implements EmployeeDetailService{

	EmployeeDetailDAO dao=EmployeeDetailFactory.getInstance();
	
	//EmployeeDetailDAO dao=new EmployeeDetailHibernateImplementation();
	
	public EmployeeDetail getEmpDetail(int id) {
		// TODO Auto-generated method stub
		return dao.getEmpDetail(id);
	}

	public List<EmployeeDetail> getAllEmpDetail() {
		// TODO Auto-generated method stub
		return dao.getAllEmpDetail();
	}

	public boolean createEmpRecord(EmployeeDetail emp) {
		// TODO Auto-generated method stub
		return dao.createEmpRecord(emp);
	}

	public boolean updateEmpRecord(EmployeeDetail emp) {
		// TODO Auto-generated method stub
		return dao.updateEmpRecord(emp);
	}

	public boolean deleteEmpRecord(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmpRecord(id);
	}

}
