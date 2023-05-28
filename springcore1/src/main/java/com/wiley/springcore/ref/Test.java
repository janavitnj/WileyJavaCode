package com.wiley.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore1.Student;

public class Test {

	 public static void main( String[] args )
	    {
	        ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore/ref/configref.xml");
	        WileyA w=(WileyA) context.getBean("waref");
	        System.out.println(w.getOb().getCount());
	    }

}
