package com.springCoreAssignment.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreAssignment/Question2/config.xml");
		Question question = (Question)context.getBean("question");
		System.out.println(question.getQuestion());
		System.out.println(question.getAnswer1());
		System.out.println(question.getAnswer2());
		System.out.println(question.getAnswer3());
	}
}
