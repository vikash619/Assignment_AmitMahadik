package com.junit.assignment.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	MinMaxFinder minmaxfinder;
	
	public MinMaxFinderTest() {
		this.minmaxfinder = new MinMaxFinder();
	}
	
	
	@Test
	@DisplayName("fiunction to find minimum in array")
	void findMin() {
		int [] arr = {1,2,3,4};
		int [] newArr = minmaxfinder.findMinMax(arr);
		assertEquals(1, newArr[0]);
	}
	
	@Test
	@DisplayName("fiunction to find maximum in array")
	void findMax() {
		int [] arr = {1,2,3,4};
		int [] newArr = minmaxfinder.findMinMax(arr);
		assertEquals(4, newArr[1]);
	}

	@Test
	@DisplayName("fiunction to check if array contains only zero in array")
	void ifContainsZero() {
		int [] arr = {0,0,0};
		int [] newArr = minmaxfinder.findMinMax(arr);
	
		
		assertAll(
					() -> assertEquals(0,newArr[0]),
					() -> assertEquals(0,newArr[1])
			     );
	}
}
