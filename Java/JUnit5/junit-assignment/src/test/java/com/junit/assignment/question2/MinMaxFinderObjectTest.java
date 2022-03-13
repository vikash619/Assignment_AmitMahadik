package com.junit.assignment.question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderObjectTest {

	MinMaxFinderObject minmaxfinder = new MinMaxFinderObject();
	
	@Test
	@DisplayName("function to find minimum in array")
	void findMin() {
		int [] arr = {1,2,3,4};
		MinMaxObject ob = minmaxfinder.findMinMax(arr);
		
		assertEquals(1, ob.min, "Excepted 1 as a output");
	}
	
	@Test
	@DisplayName("function to find maximum in array")
	void findMax() {
		int [] arr = {1,2,3,4};
		MinMaxObject ob = minmaxfinder.findMinMax(arr);
		
		assertEquals(4, ob.max, "Excepted 4 as a output");
	}
	
	@Test
	@DisplayName("function to find minimum and maximum in array")
	void findMinMax() {
		int [] arr = {1,2,3,4};
		MinMaxObject ob = minmaxfinder.findMinMax(arr);
		
		assertAll(
				
				()->assertEquals(1, ob.min, "Excepted 1 as a output"),
				()->assertEquals(4, ob.max, "Excepted 4 as a output")
				
				);
	}

}
