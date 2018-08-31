package com.capgemini.day2.tests;

public class ElementInArray {

	public static boolean arrayElement(int n) {
		int a[] = {1,5,6,7,12,14,15,16,18,20,22,24,25,26,28};

		for(int i=0;i<15;i++) {
			if(a[i]==n) 
				return true;
		}
		return false;
	}
	}
