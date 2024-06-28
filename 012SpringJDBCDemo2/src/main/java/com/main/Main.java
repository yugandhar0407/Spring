package com.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.test.Employee;

public class Main {

	public static void main(String[] args){
		
		
		    try (ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml")) {
				EmployeeDao dao=(EmployeeDao)cap.getBean("edao");  
				int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
				System.out.println(status);
			} catch (BeansException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		          
			/*
			 * int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
			 * System.out.println(status);
			 * 
			 * 
			 * Employee e=new Employee(); e.setId(102); int status=dao.deleteEmployee(e);
			 * System.out.println(status);
			 */
		      
		}  
		  
		
	}

