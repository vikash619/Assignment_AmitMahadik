package com.springCoreAssignment.Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreAssignment/Question3/config.xml");
		
		BankAccountController bankAccountController = (BankAccountController)context.getBean("bankAccountController");
		System.out.println("before withdraw "+bankAccountController.getBalance(1001));
		bankAccountController.withdraw(1001, 1500);
		System.out.println("after withdraw "+bankAccountController.getBalance(1001));
		
		System.out.println("before deposit "+bankAccountController.getBalance(1002));
		bankAccountController.deposit(1002, 5000);
		System.out.println("after withdraw "+bankAccountController.getBalance(1002));
		
		System.out.println("before fund transfer "+bankAccountController.getBalance(1001));
		System.out.println("before fund transfer "+bankAccountController.getBalance(1002));
		bankAccountController.fundTransfer(1001,1002,5000);
		System.out.println("after fund transfer "+bankAccountController.getBalance(1001));
		System.out.println("after fund transfer "+bankAccountController.getBalance(1002));
	}
}
