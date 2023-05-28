package com.wiley.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.ci.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/lifeconfig.xml");
		Pizza wst1 = (Pizza) context.getBean("p1");
		System.out.println(wst1);
		//context.registerShutdownHook();
	}

}
