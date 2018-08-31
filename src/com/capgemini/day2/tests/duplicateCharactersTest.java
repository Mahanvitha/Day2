package com.capgemini.day2.tests;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.DuplicateCharacters;

class duplicateCharactersTest {

	@Test
	void test() {
	assertArrayEquals("abc",DuplicateCharacters.duplicateCharactersTest("aabb"));
	}

	private void assertArrayEquals(String string, String duplicateCharactersTest) {
		// TODO Auto-generated method stub
		
	}

}
