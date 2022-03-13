package com.junit.assignment.question2;

public class Main {
	public static void main(String [] args) {
		int [] arr = {1,2,3,4};
		MinMaxFinderObject minmaxfinder = new MinMaxFinderObject();
		MinMaxObject ob = minmaxfinder.findMinMax(arr);
		
		System.out.println("Minimum "+ob.min+" "+"Maximum "+ob.max);
	}
}
