package com.prowings.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDependOnAnnotaion {
	
	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		A a = cxt.getBean("beanA",A.class);
		
		a.call();
		
	}

}
