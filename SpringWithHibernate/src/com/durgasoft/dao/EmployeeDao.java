package com.durgasoft.dao;

import java.util.List;

import com.durgasoft.beans.Employee;

public interface EmployeeDao 
{
	public String insertEmployee(Employee emp);
	public String updateEmployee(Employee emp);
	public Employee searchEmployee(int eno);
	public String deleteEmployee(int eno);
	public List<Employee> findAllUsingHQL();
	public List<Employee> findAllUsingCriteria();
}
