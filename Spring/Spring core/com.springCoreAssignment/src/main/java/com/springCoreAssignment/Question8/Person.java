package com.springCoreAssignment.Question8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean{
	private String personName;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String personName) {
		super();
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + "]";
	}
	
	public void init() {
		System.out.println("Init Method Running");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Method of InitializingBean Running");
		
	}
	
	public void destroy() {
		System.out.println("destroy Method of DisposableBean Running");
	}
	
	public void destroy1() {
		System.out.println("destroy Method Running");
	}

	@PostConstruct
	public void start() {
		System.out.println("destroy Method Running");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("destroy Method Running");
	}
	
	
}
