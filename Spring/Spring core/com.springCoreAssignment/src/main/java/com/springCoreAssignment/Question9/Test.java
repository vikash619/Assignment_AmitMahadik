package com.springCoreAssignment.Question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreAssignment/Question9/config.xml");
		Demo demo = (Demo)context.getBean("demo");
		System.out.println(demo);
		context.registerShutdownHook();
	}
}
