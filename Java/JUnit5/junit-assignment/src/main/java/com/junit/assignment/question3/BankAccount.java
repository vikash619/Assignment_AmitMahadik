package com.junit.assignment.question3;

class InsufficientException extends Throwable{
	public InsufficientException() {
		System.out.println("InsufficientException");
	}
}

public class BankAccount{
	float balance;
	
	public BankAccount() {
		this.balance = 10000;
	}
	
	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float withdraw(float amount) throws InsufficientException{
		if(amount == 0 || amount > balance){
			throw new InsufficientException();
		}
		
		balance = balance - amount;
		return amount;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
}
