package com.capgemini.day2.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class DiscountCalculation {
	@Test
	void test() {
		assertEquals(78.0, NewAmount.DiscountCalculation(120));
		assertEquals(210.99, NewAmount.DiscountCalculation(324.6));
		assertEquals(53.95, NewAmount.DiscountCalculation(0123));
		assertEquals(577.84935, NewAmount.DiscountCalculation(888.999));	
		assertEquals(0, NewAmount.DiscountCalculation(-123));
		assertEquals(0.00, NewAmount.DiscountCalculation(0));
	}

}
