package com.wiley.springcore.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com\\wiley\\springcore\\factory\\AWconfig.xml");
		Foo f = context.getBean("foo", Foo.class);
		System.out.println(f);
		
		Bar b=context.getBean("bar",Bar.class);
		System.out.println(b);

	}

}