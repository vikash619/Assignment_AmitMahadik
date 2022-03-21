package com.springCoreAssignment.Question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreAssignment/Question10/config.xml");
		CompanyName companyName = (CompanyName) context.getBean("companyName");
		System.out.println(companyName.getEmployeeName("emp")+" works in "+companyName.getCompanyName());
	}

}

