package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.averageMarks;

class AverageMarksTest {

	@Test
	void test() {
		assertEquals(180,60,averageMarks.TotalMarksStd1(60,60,60));
		assertEquals(170,56.10,averageMarks.TotalMarksStd1(50,60,60));
		assertEquals(170,56.10,averageMarks.TotalMarksStd1(50,60,60));
		assertEquals(160,53.3,averageMarks.TotalMarksSub1(60,50,50));
	}

}
