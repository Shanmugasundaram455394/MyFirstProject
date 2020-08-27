package com.durgasoft.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;
import com.durgasoft.dao.EmployeeDao;

public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			EmployeeDao dao=(EmployeeDao)context.getBean("empDao");
			
//			Employee emp=new Employee();
//			emp.setEno(00005);
//			emp.setEname("Babu S");
//			emp.setEsal(18000);
//			emp.setEaddr("Kumbakonam");
//			String strStatus=dao.insertEmployee(emp);
//			System.out.println(strStatus);
			
//			Employee emp=dao.searchEmployee(00002);
//			if(emp != null)
//			{
//				System.out.println("Employee Details");
//				System.out.println("-----------------------------------");
//				System.out.println("Employee Number	: "+emp.getEno());
//				System.out.println("Employee Name	: "+emp.getEname());
//				System.out.println("Employee Salary	: "+emp.getEsal());
//				System.out.println("Employee Address: "+emp.getEaddr());
//			}
//			else
//			{
//				System.out.println("Employee Not Existed");
//			}
			
//			Employee emp=new Employee();
//			emp.setEno(00001);
//			emp.setEname("Karthi S");
//			emp.setEsal(40000);
//			emp.setEaddr("Dubai");
//			String strStatus=dao.updateEmployee(emp);
//			System.out.println(strStatus);
			
//			String strStatus=dao.deleteEmployee(00003);
//			System.out.println(strStatus);
			
//			List<Employee> lts1=dao.findAllUsingHQL();
//			for(Employee emp1:lts1)
//			{
//				System.out.println(emp1.getEno()+", "+emp1.getEname()+", "+emp1.getEsal()+", "+emp1.getEaddr());
//			}
			
			List<Employee> lts1=dao.findAllUsingCriteria();
			for(Employee emp1:lts1)
			{
				System.out.println(emp1.getEno()+", "+emp1.getEname()+",	"+emp1.getEsal()+",	"+emp1.getEaddr());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
