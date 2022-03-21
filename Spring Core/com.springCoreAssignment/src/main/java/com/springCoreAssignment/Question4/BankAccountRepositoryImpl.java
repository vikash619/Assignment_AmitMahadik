package com.springCoreAssignment.Question4;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountRepositoryImpl implements BankAccountRepository{
	private BankAccount BankAccount1;
	private BankAccount BankAccount2;
	
	@Autowired
	public BankAccountRepositoryImpl(BankAccount BankAccount1, BankAccount BankAccount2) {
		super();
		this.BankAccount1 = BankAccount1;
		this.BankAccount2 = BankAccount2;
	}

	public double getBalance(long accountId) {
		if(accountId == BankAccount1.getAccountId()) {
			return BankAccount1.getAccountBalance();
		}
		
		if(accountId == BankAccount2.getAccountId()) {
			return BankAccount2.getAccountBalance();
		}
		return 0;
	}
	
	public double updateBalance(long accountId, double newBalance) {
		double updatedBalance = 0;
		if(accountId == BankAccount1.getAccountId()) {
			double balance = BankAccount1.getAccountBalance();
			balance = balance + newBalance;
			BankAccount1.setAccountBalance(newBalance);
			updatedBalance = BankAccount1.getAccountBalance();
			return updatedBalance;
		}
		if(accountId == BankAccount2.getAccountId()) {
			double balance = BankAccount2.getAccountBalance();
			balance = balance + newBalance;
			BankAccount2.setAccountBalance(newBalance);
			updatedBalance = BankAccount2.getAccountBalance();
			return updatedBalance;
		}
		
		return updatedBalance;
	}
}
