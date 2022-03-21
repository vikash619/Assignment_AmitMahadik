package com.java.assignment.question3;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");
		
		String [] arr = list.stream().toArray(size -> new String[size]);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
