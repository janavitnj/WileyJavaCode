package com.wiley.Sprincore.Annotation;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;
private List friends;
private HashMap course;
	public Employee(Address address, List friends, HashMap course) {
	super();
	this.address = address;
	this.friends = friends;
	this.course = course;
}
	public HashMap getCourse() {
	return course;
}
public void setCourse(HashMap course) {
	this.course = course;
}
	public Employee(Address address, List friends) {
	super();
	this.address = address;
	this.friends = friends;
}
	public List getFriends() {
	return friends;
}
public void setFriends(List friends) {
	this.friends = friends;
}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", friends=" + friends + ", course=" + course + "]";
	}
	
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}

}