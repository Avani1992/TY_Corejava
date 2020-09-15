package com.tyss.practicedesignpattern.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.practicedesignpattern.dto.Employee;

public class EmployeeHibernateImplementation implements EmployeeDAO{

	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction =null;

	public Employee getEmployeeDetailById(int id) {
		factory = Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		Employee record = manager.find(Employee.class,id);
		manager.close();
		return record;
	}

	public List<Employee> getAllEmployeeDetail() {
		factory = Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		String query="select e from Employee e";
		TypedQuery<Employee> record = manager.createQuery(query, Employee.class);
		List<Employee> list = record.getResultList();
		manager.close();
		return list;

	}

	public boolean createEmployeeInfo(Employee emp) {
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			emp.setEmpId(114);
			emp.setName("Kuman");
			emp.setDate(Date.valueOf("1991-07-11"));
			emp.setEmail("Kuman@gmail.com");
			emp.setDeptno(20);
			emp.setDesignation("SoftwareDeveloper");
			emp.setJdate(Date.valueOf("2013-04-04"));
			emp.setMid(1002);
			emp.setMobileno(9925321);
			emp.setSalary(76000);
			emp.setAge(27);
			manager.persist(emp);
			transaction.commit();
			manager.close();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			manager.close();
			return false;
		}
	}// End of Method

	public boolean deleteEmployeeDetail(int id) {
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			//Employee record = manager.find(Employee.class, id);
			//manager.remove(record);
			String query="delete from Employee e where e.empId=:id";

			Query delete = manager.createQuery(query);
			delete.setParameter("id",id);
			int i = delete.executeUpdate();
			transaction.commit();
			manager.close();
			if(i==1) {
				return true;}
			else {
				return false;
			}
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			manager.close();
			return false;
		}
	}

	public boolean updateEmployeeDetail(Employee employee) {
		try {
			factory=Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql="update Employee e set e.name=:nm where e.empId=:id";
			Query query = manager.createQuery(jpql);
			employee.setName("Akshita");
			
			query.setParameter("id", 112);
			query.setParameter("nm", employee.getName());
			int i = query.executeUpdate();
			transaction.commit();
			manager.close();
			if(i==1) {
				return true;}
			else {
				return false;
			}
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			manager.close();
			return false;
		}
	}// End of Method

}// End of Class
