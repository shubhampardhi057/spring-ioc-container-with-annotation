package com.prowings.dependson;

import org.springframework.stereotype.Component;

@Component("beanC")
public class C {

	public C() {
		super();
		
		
		System.out.println("No-arg constructor invoked for Class C !!!!");
	}
	
	

}
