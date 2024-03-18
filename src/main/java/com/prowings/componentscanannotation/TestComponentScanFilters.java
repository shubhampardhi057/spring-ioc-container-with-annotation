package com.prowings.componentscanannotation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prowings.package1.BeanB;
import com.prowings.package2.BeanX;

public class TestComponentScanFilters {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		System.out.println(cxt.getBeanDefinitionCount());
		
		System.out.println(Arrays.toString(cxt.getBeanDefinitionNames()));
		
		
//		BeanB b = cxt.getBean(BeanB.class);
		
//		System.out.println(b);
		
		BeanX x = cxt.getBean(BeanX.class);
		
		System.out.println(x);
		
	}

}
