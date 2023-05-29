package com.wiley.springcore.factory;

public class InstanceBarFactory {
	public Bar createInstance(String name)
	{
		return new Bar(name);
		
	}
}
