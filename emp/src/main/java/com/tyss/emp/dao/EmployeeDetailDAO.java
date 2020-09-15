package com.tyss.emp.dao;

import java.util.List;

import com.tyss.emp.dto.EmployeeDetail;



public interface EmployeeDetailDAO {
	
	public EmployeeDetail getEmpDetail(int id);
	public List<EmployeeDetail> getAllEmpDetail();
	public boolean createEmpRecord(EmployeeDetail emp);
	public boolean updateEmpRecord(EmployeeDetail emp);
	public boolean deleteEmpRecord(int id);

}
