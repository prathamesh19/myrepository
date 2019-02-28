package com.prathamesh.spring.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Employee e1=(Employee) context.getBean("emp");
    System.out.println(e1);

	}
	
	
}