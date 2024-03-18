package com.prowings.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainerAnnotations {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansAutowiring.xml");
		
		Car c1 = context.getBean("car1",Car.class);
		
		System.out.println(c1);
		
		
		Student s1 = context.getBean("std1",Student.class);
		
		System.out.println(s1);
		
		Student s2 = context.getBean("std2",Student.class);
		
		System.out.println(s2);
	}

}
