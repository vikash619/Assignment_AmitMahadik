package com.springCoreAssignment.Question9;

public class Demo {
	private String lifeCycle;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(String lifeCycle) {
		super();
		this.lifeCycle = lifeCycle;
	}

	public String getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(String lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	@Override
	public String toString() {
		return "Demo [lifeCycle=" + lifeCycle + "]";
	}
	
	public void init() {
		System.out.println("Bean going to be created");
	}
	
	public void destroy() {
		System.out.println("Bean going to be destroy");
	}
}
