package com.junit.assignment.question3;

public class Main {
	public static void main(String [] args) {
		int amount = 11000;
		BankAccount bankaccount = new BankAccount();
		
		try {
			System.out.println("Old balance "+bankaccount.getBalance());
			System.out.println("Withdrawn amount "+bankaccount.withdraw(amount));
			System.out.println("New Balance "+bankaccount.getBalance());
		}catch(Exception | InsufficientException e) {
			System.out.println(e);
		}
	}
}
