package com.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
	   
	Emp Emp1=(Emp) context.getBean("Emp1");
	
	System.out.println("name " + Emp1.getName());
	System.out.println(Emp1.getPhones());
	System.out.println(Emp1.getAddresses());
	System.out.println(Emp1.getCourses());
	System.out.println(Emp1.getProp());
	}
	

}
