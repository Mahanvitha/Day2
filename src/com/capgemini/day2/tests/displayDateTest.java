package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.DateDisplay;

class displayDateTest {

	@Test
	void test() {
		assertEquals("5/May/1997",DateDisplay.displayDateTest("5,5,1997"));
	}

}
