package com.wiley.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\wiley\\stereotype\\configref.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println(student);

	}

}