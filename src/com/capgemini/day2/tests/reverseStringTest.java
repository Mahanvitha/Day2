package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.RevString;

class reverseStringTest {
String arr1 = "string reverse is";
@Test
	void test() {
		assertEquals("gnirts esrever si ",RevString.reverseStringTest(arr1));
	}

}
