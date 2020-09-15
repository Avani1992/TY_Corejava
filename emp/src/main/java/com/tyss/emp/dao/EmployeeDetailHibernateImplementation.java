package com.tyss.emp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.emp.dto.EmployeeDetail;

public class EmployeeDetailHibernateImplementation  implements EmployeeDetailDAO{

	EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");
	EntityManager manager=null;
	EntityTransaction transaction=null;

	@Override
	public EmployeeDetail getEmpDetail(int id) {
		try{

			manager = factory.createEntityManager();
			EmployeeDetail record = manager.find(EmployeeDetail.class, id);
			manager.close();
			return record;

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public List<EmployeeDetail> getAllEmpDetail() {
		try{

			manager = factory.createEntityManager();
			String query="select e from EmployeeDetail e";
			TypedQuery<EmployeeDetail> result = manager.createQuery(query,EmployeeDetail.class);
			List<EmployeeDetail> record = result.getResultList();
			manager.close();
			return record;

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public boolean createEmpRecord(EmployeeDetail emp) {
		try{

			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			emp.getEid();
			emp.getName();
			emp.getAge();
			emp.getDob();
			emp.getEmail();
			emp.getMobileno();
			emp.getSalary();
			emp.getDoj();
			emp.getDesignation();
			emp.getDeptno();
			manager.persist(emp);
			transaction.commit();
			manager.close();
			return true;

		}catch(Exception ex) {
			transaction.rollback();
			System.out.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateEmpRecord(EmployeeDetail emp) {

		try{

			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String uquery="update EmployeeDetail e set e.salary=:salary where e.eid=:id";
			Query query = manager.createQuery(uquery);
			query.setParameter("salary", emp.getSalary());
			query.setParameter("id", emp.getEid());
			int i = query.executeUpdate();
			transaction.commit();
			manager.close();
			if(i==1) {
				return true;}
			else {
				return false;
			}

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public boolean deleteEmpRecord(int id) {
		try{

			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String dquery="delete from EmployeeDetail e  where e.eid=:id";
			Query query = manager.createQuery(dquery);
			query.setParameter("id", id);
			
			int i = query.executeUpdate();
			transaction.commit();
			manager.close();
			if(i==1) {
				return true;}
			else {
				return false;
			}

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
			}

}
