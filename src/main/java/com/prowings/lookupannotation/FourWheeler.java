package com.prowings.lookupannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fourwheeler")
public class FourWheeler {

	@Value(value = "2023")
	int model;
	
	@Value(value = "Toyota")
	String company;
	
	@Value(value = "SUV")
	String type;
	
	@Autowired
	Engine engine;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Lookup
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "FourWheeler [model=" + model + ", company=" + company + ", type=" + type + ", engine=" + engine + "]";
	}
	
	
	
}
