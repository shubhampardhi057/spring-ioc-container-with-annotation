package com.prowings.autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	int id;
	
	String name;
	
	@Autowired
	Department dept;

	public Employee() {
		super();
		System.out.println("no-arg Of Employee");
	}
//	@Autowired
	public Employee(Department dept) {
		super();
		this.dept = dept;
		System.out.println("1-arg  Of Employee Department");
	}

	public Employee(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		System.out.println("all-arg of Employee");
	}

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
		System.out.println("Setter Of id Employee");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter Of Name Employee");
	}


	public Department getDept() {
		return dept;
	}
	
	
//	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
		
		System.out.println("Setter Of dept Employee");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	
	
	
	
	
}
