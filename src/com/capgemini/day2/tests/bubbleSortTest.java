package com.capgemini.day2.tests;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.testsjava.BubbleSort;

class bubbleSortTest {
int []a = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	@Test
	void test() {
		assertEquals(1,5,6,7,12,14,19,23,26,35,37,47,52,78,86,BubbleSort.bubbleSortTest(a));
	}
	private void assertEquals(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u,
			int v, int w, int bubbleSortTest) {
		// TODO Auto-generated method stub
		
	}
	

}
