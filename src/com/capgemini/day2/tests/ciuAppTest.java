package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.CiuApp;

class ciuAppTest {

	@Test
	void test() {
		assertEquals(true,CiuApp.ciuAppCheck("Mahanvitha","123"));
	}

}
