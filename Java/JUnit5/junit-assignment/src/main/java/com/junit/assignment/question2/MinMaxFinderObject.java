package com.junit.assignment.question2;

public class MinMaxFinderObject {
	public MinMaxObject findMinMax(int [] arr) {
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
		
		return new MinMaxObject(min,max);
	}
}
