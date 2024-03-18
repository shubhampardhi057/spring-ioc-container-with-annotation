package com.prowings.qualifierannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.prowings.qualifierannotation")
public class StudentAddressConfiguration {
	
	@Bean(name = "address1")
	@Primary
	public Address getAddress1() {
		
		return new Address(123,"Pune");
	}
	
	
	@Bean(name = "address2")
	public Address getAddress2() {
		
		return new Address(456,"Mumbai");
	}

}
