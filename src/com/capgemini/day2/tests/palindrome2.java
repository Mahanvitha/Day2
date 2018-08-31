package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class palindrome2 {

	@Test
	void test() {
		assertEquals(true,palindromeCheck.palindrome2(121));
		assertEquals(false,palindromeCheck.palindrome2(100));
		assertEquals(true,palindromeCheck.palindrome2(0));
		assertEquals(false,palindromeCheck.palindrome2('a'));
	}

}
