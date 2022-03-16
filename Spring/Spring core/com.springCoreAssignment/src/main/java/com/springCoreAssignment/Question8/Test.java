package com.springCoreAssignment.Question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreAssignment/Question8/config.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person);
		context.registerShutdownHook();
	}
}
