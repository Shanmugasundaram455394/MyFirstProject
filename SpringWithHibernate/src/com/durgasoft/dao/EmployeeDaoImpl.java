package com.durgasoft.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.durgasoft.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	public String strStatus="";
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate=hibernateTemplate;
	}
	
//	@Transactional
	@Override
	public String insertEmployee(Employee emp) 
	{
		Integer in=(Integer)hibernateTemplate.save(emp);
		if(in==emp.getEno())
		{
			strStatus="SUCCESS";
		}
		else
		{
			strStatus="FAILURE";
		}
		return strStatus;
	}

//	@Transactional
	@Override
	public Employee searchEmployee(int eno) 
	{
		Employee emp=(Employee)hibernateTemplate.get(Employee.class, eno);
		return emp;
	}

//	@Transactional
	@Override
	public String updateEmployee(Employee emp) 
	{
		hibernateTemplate.update(emp);
		strStatus="SUCCESS";
		return strStatus;
	}

//	@Transactional
	@Override
	public String deleteEmployee(int eno) 
	{
		Employee emp=new Employee();
		emp.setEno(eno);
		hibernateTemplate.delete(emp);
		strStatus="SUCCESS";
		return strStatus;
	}
	
//	@Transactional
	@Override
	public List<Employee> findAllUsingHQL() 
	{
		List<Employee> empAllUseHql=(List<Employee>) hibernateTemplate.find("from Employee");
		return empAllUseHql;
	}
	
//	@Transactional
	@Override
	public List<Employee> findAllUsingCriteria() 
	{
		DetachedCriteria dc=DetachedCriteria.forClass(Employee.class);
//		dc.setProjection(projection);
//		dc.add(criterion);
				
		List<Employee> empAllUseCriteria=(List<Employee>) hibernateTemplate.findByCriteria(dc);
		return empAllUseCriteria;
	}
}
