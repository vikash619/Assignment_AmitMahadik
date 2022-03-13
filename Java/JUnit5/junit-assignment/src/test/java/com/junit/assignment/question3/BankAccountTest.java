package com.junit.assignment.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	@DisplayName("function to check whether InsufficientException will throw by function or not")
	void checkInsufficientException() {
		float amount = 11000;
		BankAccount bancaccount = new BankAccount();
		
		assertThrows(InsufficientException.class, ()-> bancaccount.withdraw(amount));
	}

}
