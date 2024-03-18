package com.prowings.javabasedconfiguration;

public class Device {
	
	private String name;
	private double price;

	public Device() {
		super();
	}

	public Device(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", price=" + price + "]";
	}
	
}
