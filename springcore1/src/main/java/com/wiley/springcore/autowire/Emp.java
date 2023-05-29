package com.wiley.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
		super();
	}

}