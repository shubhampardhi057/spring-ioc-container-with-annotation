package com.prowings.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

//@Configuration
//@Component
@Service
public class MySpringContextConfig {

	@Bean(name = "std1")
	public Student getStudent()
	{
		Student s = new Student();
		s.setRoll(10);
		s.setName("Ram");
		s.setAddress("Pune");
		
		return s;
		
	}
	@Bean(name = "std2")
	public Student getStudent1()
	{
		Student s = new Student();
		s.setRoll(20);
		s.setName("Sham");
		s.setAddress("Mumbai");
		
		return s;
		
	}
}
