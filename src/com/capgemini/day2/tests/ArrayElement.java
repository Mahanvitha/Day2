package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayElement {

	@Test
	void test(){
		assertEquals(true,ElementInArray.arrayElement(1));
		assertEquals(false,ElementInArray.arrayElement(0));
		assertEquals(false,ElementInArray.arrayElement(29));
		assertEquals(false,ElementInArray.arrayElement('a'));
		assertEquals(false,ElementInArray.arrayElement(1000000));
	}

}
