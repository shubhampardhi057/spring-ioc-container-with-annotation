package com.prowings.javabasedconfiguration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaBasedConfiguration {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
		
		cxt.register(ShoppingListConfiguration.class);
		cxt.refresh();
		
		System.out.println("Total beans in Container :"+cxt.getBeanDefinitionCount());
		System.out.println("Bean Names :"+ Arrays.toString(cxt.getBeanDefinitionNames()));
		
		Device lenovoLaptop = cxt.getBean("lenovo",Device.class);
		Device hpLaptop = cxt.getBean("hp",Device.class);
		Device iPhone = cxt.getBean("iPhone",Device.class);
		Device mIPhone = cxt.getBean("mIPhone",Device.class);
		
		
		System.out.println(lenovoLaptop);
		System.out.println(hpLaptop);
		System.out.println(iPhone);
		System.out.println(mIPhone);
		
		ShoppingList list1 = cxt.getBean(ShoppingList.class);
		list1.addItems(mIPhone);
		list1.addItems(hpLaptop);
		
		System.out.println("Shopping List 1 :"+list1.getItems());
		
		ShoppingList list2 = cxt.getBean(ShoppingList.class);
		list2.addItems(iPhone);
		list2.addItems(lenovoLaptop);
		
		System.out.println("Shopping List 2 :"+list2.getItems());
		
		System.out.println(list1 == list2);
		
		
		System.out.println("Total beans in Container :"+cxt.getBeanDefinitionCount());
		System.out.println("Bean Names :"+ Arrays.toString(cxt.getBeanDefinitionNames()));
		
		
	}
}
