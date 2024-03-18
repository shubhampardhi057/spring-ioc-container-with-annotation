package com.prowings.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "engine")
public class Engine {
	
	@Value(value = "3")
	int capacity;
	
	@Value(value = "In-Line 4")
	String type;
	
	
	public Engine() {
		super();
	}
	

	public Engine(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	
	
	

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
	

}
