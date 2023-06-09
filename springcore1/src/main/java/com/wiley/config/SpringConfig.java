package com.wiley.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.wiley.config")
public class SpringConfig {
	
	@Bean
	public Beer getBeer()
	{
		return new Beer();
	}
	@Bean
	public Student getStudent()
	{
		Student student=new Student(getBeer());
		return student;
	}
}
