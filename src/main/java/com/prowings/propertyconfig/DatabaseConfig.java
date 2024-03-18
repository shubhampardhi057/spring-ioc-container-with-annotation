package com.prowings.propertyconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.prowings.propertyconfig")
public class DatabaseConfig {
	
	@Autowired
	Environment ev;
	
	@Bean
	public MyDatabaseDetails dbDetails() {
		
		MyDatabaseDetails dbDetails = new MyDatabaseDetails();
		dbDetails.setUrl(ev.getProperty("dburl"));
		dbDetails.setUsername(ev.getProperty("dbusername"));
		dbDetails.setPassword(ev.getProperty("dbpwd"));
		dbDetails.setMyArray(ev.getProperty("myarray",String[].class));
		dbDetails.setMyList(ev.getProperty("mylist",List.class));
		
		return dbDetails;
	}

}
