package com.springCoreAssignment.Question7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//7) Write a Java program to demonstrate SPEL (Spring Expression language)
public class Test {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreAssignment/Question7/spelconfig.xml");
		Demo demo = (Demo)context.getBean("db");
		System.out.println(demo);
	}
}
