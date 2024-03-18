package com.prowings.dependson;

import org.springframework.stereotype.Component;

@Component("beanB")
public class B {

	public B() {
		super();
		
		System.out.println("No-arg constructor invoked for Class B !!!!");
	}

	
	public void print() {
		
		System.out.println("Inside Print()- B");
	}
}
