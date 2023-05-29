package com.wiley.Sprincore.Annotation;

import java.util.Set;

public class Address {
	private String city;
	private Set phone;
	public Address(String city, Set phone) {
		super();
		this.city = city;
		this.phone = phone;
	}
	public Set getPhone() {
		return phone;
	}
	public void setPhone(Set phone) {
		this.phone = phone;
	}
	public Address() {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String city) {
		super();
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", phone=" + phone + "]";
	}

}