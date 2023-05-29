package com.wiley.springcore1;
public class Address {
	
	private String city;
	private String street;
	
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}

}