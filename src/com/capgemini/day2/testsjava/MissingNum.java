package com.capgemini.day2.testsjava;


public class MissingNum {

	public static int missingNumberTest(int[] num, int n) {
		int i,sum;
		
		int array[]= new int[n];
		
		for(i=0; i<=n-1; i++) {
		}
		sum = (n*(n+1))/2;
		for(i=0; i<n; i++) {
			sum = sum-array[i];
		}
		

			

		return sum;
	}

}
