package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.MultiDimensionArray;

class multiDimensionArrayTest {
int [][] array = {{1,2},{3,4}};
	@Test
	void test() {
		assertEquals(true,MultiDimensionArray.mutliDimensionalArray(array,3));
		assertEquals(false,MultiDimensionArray.mutliDimensionalArray(array,0));
		assertEquals(true,MultiDimensionArray.mutliDimensionalArray(array,4));
	}

}
