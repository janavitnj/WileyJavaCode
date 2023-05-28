package com.wiley.springcore.ci;

public class Person {
	private String name;

	private int id;
	Cert cert;

	public Person(String name, int id, Cert cert) {
		super();
		this.name = name;
		this.id = id;
		this.cert = cert;
	}

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return name + " bearing id " + id + " is certified in " + cert.name;
	}

}
