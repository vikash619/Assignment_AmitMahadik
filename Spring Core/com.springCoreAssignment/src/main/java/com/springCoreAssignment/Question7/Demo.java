package com.springCoreAssignment.Question7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("db")
public class Demo {
	
	@Value("#{11+22}")
	private int x;
	
	@Value("#{22/11}")
	private int y;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
}
