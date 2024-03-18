package com.prowings.dependson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("beanA")
@DependsOn({"beanB","beanC"})
//@DependsOn("beanC")
public class A {
	
	@Autowired
	B b;

	public A() {
		super();
		
		System.out.println("No-arg constructor invoked for Class A !!!!");
	}
	
	public void call() {
		
		b.print();
	}

	
}
