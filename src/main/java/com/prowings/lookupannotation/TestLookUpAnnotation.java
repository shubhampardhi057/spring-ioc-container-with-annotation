package com.prowings.lookupannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLookUpAnnotation {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
		
		cxt.register(CarConfiguration.class);
		cxt.refresh();
		
		FourWheeler bmw = cxt.getBean("fourwheeler",FourWheeler.class);
		
		System.out.println("BMW :"+ bmw);
		
		FourWheeler audi = cxt.getBean(FourWheeler.class);
		
		System.out.println("AUDI :"+ audi);
		
		
		System.out.println(audi == bmw);
		
		System.out.println(audi.getEngine() == bmw.getEngine());
		
		
		
	}

}
