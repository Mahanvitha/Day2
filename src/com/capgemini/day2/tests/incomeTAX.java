package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class incomeTAX {
			@Test
			void test() {
				assertEquals(180000.0, TaxPay.incomeTax(600000.0));
				assertEquals(18180.056, TaxPay.incomeTax(181800.56));
				assertEquals(0, TaxPay.incomeTax(10000000));
				assertEquals(0, TaxPay.incomeTax(-600000));
			}

		
	}


