package com.prowings.autowire_annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {
	
	@Bean(name = "emp1",autowire = Autowire.BY_TYPE)
	public Employee getEmployee1() {
		
		Employee e1 = new Employee();
		e1.setId(102);
		e1.setName("Naam");
		
		return e1;
	}
	
	@Bean(name = "dept")
	public Department getDepartment1() {
		
		Department d1 = new Department();
		d1.setDeptId(201);
		d1.setName("IT");
		
		return d1;
	}
	
	


}
