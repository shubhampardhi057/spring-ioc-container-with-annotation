package com.prowings.propertyconfig;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPropertyConfiuration {
	
	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		
		MyDatabaseDetails dbDetails = cxt.getBean(MyDatabaseDetails.class);
		
		
		System.out.println(dbDetails);
		
	
		System.out.println(cxt.getBeanDefinitionCount());
		
		System.out.println(Arrays.toString(cxt.getBeanDefinitionNames()));
	}

}
