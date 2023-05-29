package com.wiley.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/autoconfig.xml");
        Emp wst1=(Emp)context.getBean("emp2");
        System.out.println(wst1);
    }
}
