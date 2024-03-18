package com.prowings.javabasedconfiguration;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy
public class ShoppingList {
	
	List<Device> items = new ArrayList<Device>();
	
	public List<Device> getItems(){
		
		return items;
	}
	
	public void addItems(Device device) {
		
		items.add(device);
	}

	@PostConstruct
	public void init() {
		System.out.println("Shopping List is Created!!!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Shopping List is Created!!!");
	}
}
