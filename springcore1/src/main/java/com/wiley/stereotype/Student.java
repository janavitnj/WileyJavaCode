package com.wiley.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("janavi")
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Value("bangalore")
	private String city;
	@Value("#{mf}")
	private List friends;
	public Student(String name, String city, List friends) {
		super();
		this.name = name;
		this.city = city;
		this.friends = friends;
	}
	public List getFriends() {
		return friends;
	}
	public void setFriends(List friends) {
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", friends=" + friends + "]";
	}
	
}
