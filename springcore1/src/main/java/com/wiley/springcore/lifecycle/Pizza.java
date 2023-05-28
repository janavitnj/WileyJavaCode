package com.wiley.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private int price;

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroyed");
	}
}
