package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.PalindromeChar;

class palindromesCharTest {

String [] chars = {"dad","pap","cat","dog","pat","tit","tat","mom","test","mama"};

	@Test
	void test() {
		assertEquals("dad pap tit tat mom ",PalindromeChar.palindromeCharTest(chars));
	}

}

	
		
	
