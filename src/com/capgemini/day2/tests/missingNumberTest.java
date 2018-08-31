package com.capgemini.day2.tests;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.MissingNum;

class missingNumberTest {
	int[] num = { 0, 1, 3 };

	@Test
void Test() {
		assertArrayEquals(2,MissingNum.missingNumberTest(num, 3));
	}

	private void assertArrayEquals(int i, int missingNumberTest) {
		// TODO Auto-generated method stub
		
	}

}
