package com.springCoreAssignment.Question3;

public class BankAccountRepositoryImpl implements BankAccountRepository{
	private BankAccount account1;
	private BankAccount account2;
	
	
	public BankAccountRepositoryImpl(BankAccount account1, BankAccount account2) {
		super();
		this.account1 = account1;
		this.account2 = account2;
	}

	public double getBalance(long accountId) {
		if(accountId == account1.getAccountId()) {
			return account1.getAccountBalance();
		}
		
		if(accountId == account2.getAccountId()) {
			return account2.getAccountBalance();
		}
		return 0;
	}
	
	public double updateBalance(long accountId, double newBalance) {
		double updatedBalance = 0;
		if(accountId == account1.getAccountId()) {
			double balance = account1.getAccountBalance();
			balance = balance + newBalance;
			account1.setAccountBalance(newBalance);
			updatedBalance = account1.getAccountBalance();
			return updatedBalance;
		}
		if(accountId == account2.getAccountId()) {
			double balance = account2.getAccountBalance();
			balance = balance + newBalance;
			account2.setAccountBalance(newBalance);
			updatedBalance = account2.getAccountBalance();
			return updatedBalance;
		}
		
		return updatedBalance;
	}
}
