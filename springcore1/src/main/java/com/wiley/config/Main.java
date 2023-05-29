package com.wiley.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student=con.getBean("getStudent",Student.class);
		System.out.println(student);
	}

}
