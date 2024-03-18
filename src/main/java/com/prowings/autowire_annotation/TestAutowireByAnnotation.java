package com.prowings.autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByAnnotation {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansAutowiringByAnnotation.xml");
		
		Employee e1 = context.getBean("emp1",Employee.class);
		
		System.out.println(e1);
		
//		Manager m1 = context.getBean("mngr1",Manager.class);
//		
//		System.out.println(m1);
		
//		Employee e2 = context.getBean("emp2",Employee.class);
//		
//		System.out.println(e2);
		
		
		
	}

}
