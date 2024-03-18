package com.prowings.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.prowings.javabasedconfiguration")
public class ShoppingListConfiguration {
	
	@Bean(name = "lenovo")
	@Lazy
	public Device getLenovoLaptop() {
		
		Laptop lenovo = new Laptop();
		lenovo.setName("Lenovo 12");
		lenovo.setPrice(45000);
		lenovo.setTouchScreen(true);
		
		return lenovo;
	}
	
	@Bean(name = "hp")
	@Lazy
	public Device getHpLaptop() {
		
		Laptop hp = new Laptop();
		hp.setName("Hp 55");
		hp.setPrice(55000);
		hp.setTouchScreen(false);
		
		return hp;
	}
	
	@Bean(name = "iPhone")
	@Lazy
	public Device getIphone() {
		
		Mobile iPhone = new Mobile();
		iPhone.setName("iPhone 14");
		iPhone.setPrice(70000);
		iPhone.setBatteryCapacity(3000);
		
		return iPhone;
	}
	
	@Bean(name = "mIPhone")
	@Lazy
	public Device getMIphone() {
		
		Mobile mIPhone  = new Mobile();
		mIPhone.setName("redmi note 10");
		mIPhone.setPrice(7000);
		mIPhone.setBatteryCapacity(5000);
		
		return mIPhone;
	}

	
}
