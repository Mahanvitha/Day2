package com.capgemini.day2.tests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class resultDeclaration {

	@Test
	void test() {
		assertEquals("pass",studentDeclaration.resultDeclaration(70, 80,80));
		assertEquals("fail",studentDeclaration.resultDeclaration(50, 40,30));
		assertEquals("promoted pass",studentDeclaration.resultDeclaration(70, 80,30));
		assertEquals("fail",studentDeclaration.resultDeclaration(60,60,60));
	}

}
