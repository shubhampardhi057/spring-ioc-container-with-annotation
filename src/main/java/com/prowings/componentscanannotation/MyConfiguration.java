package com.prowings.componentscanannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.prowings.package1.BeanB;

@Configuration

//@ComponentScan(basePackages = "com.prowings.package1", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = BeanB.class))

@ComponentScan(basePackages = "com.prowings.package2")
public class MyConfiguration {
	

}
