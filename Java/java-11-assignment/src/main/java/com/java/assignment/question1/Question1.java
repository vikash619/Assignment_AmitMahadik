package com.java.assignment.question1;

@FunctionalInterface
interface SimpleInterest{
	public float simpleInterest(float principal, float rate, float time);
}

public class Question1 {
	public static void main(String [] args) {
		float principal = 10;
		float rate = 5;
		float time  = 3;
		
		SimpleInterest SI = (p, r, t) ->{
			return (p*r*t)/100;
		};
		
		System.out.println(SI.simpleInterest(principal, rate, time));
		
		
	}
}
