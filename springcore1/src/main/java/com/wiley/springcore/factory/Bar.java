package com.wiley.springcore.factory;

public class Bar {
	private String name;

	public Bar(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + "]";
	}
	
}
