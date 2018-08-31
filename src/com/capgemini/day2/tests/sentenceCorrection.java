package com.capgemini.day2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.SentenceCorrection;

class sentenceCorrection {

	@Test
	void test() {
		assertEquals("sentence correction ",SentenceCorrection.sentenceCorrection("sentence      correction program ","program",3));

	}
}
