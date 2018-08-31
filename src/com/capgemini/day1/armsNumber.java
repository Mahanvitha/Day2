package com.capgemini.day1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class armsNumber {

	@Test
	void testCheckArmstrongNumber() {
		assertEquals(true, Armstrong.checkArmstrongNumber(153));
		assertEquals(true, Armstrong.checkArmstrongNumber(-153));
		assertEquals(false, Armstrong.checkArmstrongNumber(123));
		assertEquals(false, Armstrong.checkArmstrongNumber(0123));
		assertEquals(false, Armstrong.checkArmstrongNumber(0x153));
	}

}
