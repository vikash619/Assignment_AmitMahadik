package com.junit.assignment.question1;

public class Main {
	public static void main(String [] args) {
		MinMaxFinder minmaxfinder = new MinMaxFinder();
		int arr[] = {1,2,3,4};
		
		int newArr[] = minmaxfinder.findMinMax(arr);
		System.out.println(newArr[0]+" "+newArr[1]);
	}
}
