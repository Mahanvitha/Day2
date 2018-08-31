package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interestCalculation {

	@Test
	void test() {
	    assertArrayEquals(new double [] {7.2,7.3449}, SimpleCompound.interestCalculation(120,3,2),0.02);
	    assertArrayEquals(new double [] {293.591,387.366}, SimpleCompound.interestCalculation(456.88,6.8,9.45),0.02);
	    assertArrayEquals(new double [] {0.92,0.933}, SimpleCompound.interestCalculation(23,4,1),0.02);
	}


}
