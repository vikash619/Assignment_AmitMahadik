package com.junit.assignment.question4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)			//PER_METHOD is by default
class LifecycleHooksTest {
	LifecycleHooks lifecyclehooks;
	
	@BeforeAll
	static void programStarted() {
		System.out.println("program started");
	}
	
	@BeforeEach
	void init() {
		lifecyclehooks = new LifecycleHooks();
	}
	
	@Test
	void testAdd() {
		int a = 10;
		int b = 20;
		assertEquals(30, lifecyclehooks.add(a, b));
		System.out.println("Answer after calling add function "+lifecyclehooks.add(a, b));
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("clecning code");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("Program finished");
	}
	
	
}
