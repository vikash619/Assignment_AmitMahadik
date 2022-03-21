package com.springCoreAssignment.Question3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountController implements ApplicationContextAware {
	private ApplicationContext context;

	public double withdraw(long accountId, double balance) {
		BankAccountRepositoryImpl account = (BankAccountRepositoryImpl) context.getBean("bankAccountRepositoryImpl");
		double tempAmount = account.getBalance(accountId);
		if (tempAmount != 0 && tempAmount >= balance) {
			tempAmount -= balance;
			account.updateBalance(accountId, tempAmount);
			return tempAmount;
		}
		return 0;
	}

	public double deposit(long accountId, double balance) {
		BankAccountRepositoryImpl account = (BankAccountRepositoryImpl) context.getBean("bankAccountRepositoryImpl");
		double updatedAmount = account.getBalance(accountId);
		updatedAmount += balance;
		account.updateBalance(accountId, updatedAmount);
		return updatedAmount;
	}

	public double getBalance(long accountId) {
		BankAccountRepositoryImpl account = (BankAccountRepositoryImpl) context.getBean("bankAccountRepositoryImpl");
		return account.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		
		BankAccountRepositoryImpl accountepositoryImpl = (BankAccountRepositoryImpl) context.getBean("bankAccountRepositoryImpl");
		double tempAmount1 = accountepositoryImpl.getBalance(fromAccount);
		double tempAmount2 = accountepositoryImpl.getBalance(toAccount);
		
		if(tempAmount1 != 0 && tempAmount1 >= amount) {
			tempAmount1 -= amount;
			accountepositoryImpl.updateBalance(fromAccount, tempAmount1);
			tempAmount2 += amount;
			accountepositoryImpl.updateBalance(toAccount, tempAmount2);
			return true;
		}
		return false;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}
}
