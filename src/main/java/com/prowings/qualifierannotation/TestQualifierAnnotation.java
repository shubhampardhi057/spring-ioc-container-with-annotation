package com.prowings.qualifierannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestQualifierAnnotation {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
		
		cxt.register(StudentAddressConfiguration.class);
		cxt.refresh();
		
		
		Student s1 = cxt.getBean(Student.class);
		
		System.out.println(s1);
		
		
	}

}
