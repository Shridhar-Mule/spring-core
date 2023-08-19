package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/configconstructorinjection.xml");
		
		Constructor con=(Constructor) context.getBean("csi");
		System.out.println(con);
		
		
	
		
			}


	}
	


