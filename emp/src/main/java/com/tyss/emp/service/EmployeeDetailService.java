package com.tyss.emp.service;

import java.util.List;

import com.tyss.emp.dto.EmployeeDetail;

public interface EmployeeDetailService {

	public EmployeeDetail getEmpDetail(int id);
	public List<EmployeeDetail> getAllEmpDetail();
	public boolean createEmpRecord(EmployeeDetail emp);
	public boolean updateEmpRecord(EmployeeDetail emp);
	public boolean deleteEmpRecord(int id);
}
