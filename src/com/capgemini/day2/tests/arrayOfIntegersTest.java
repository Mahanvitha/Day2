package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.ArrayOfIntegers;

class arrayOfIntegersTest {
int[] integers = {0,1,1};
	@Test
	void test() {
		assertEquals(true,ArrayOfIntegers.calculateArrayIntegers(3,integers));
	}

}
