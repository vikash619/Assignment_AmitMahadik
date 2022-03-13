package com.junit.assignment.question1;

public class MinMaxFinder {
	public int[] findMinMax(int [] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index]< min) {
				min = arr[index];
			}
			
			if(arr[index] > max) {
				max = arr[index];
			}
		}
		
		int newArr[] = {min, max};
		
		return newArr;
	}
}
