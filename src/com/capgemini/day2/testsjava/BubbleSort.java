package com.capgemini.day2.testsjava;

public class BubbleSort {

	
	public static int bubbleSortTest(int[] a) {
		for(int j=0; j<a.length;j++) {
			boolean swapped = false;
			int i=0;
			while(i<15-1) {
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
				}
				i++;
			}
			if(!swapped)
				break;
		}
		for(int x:a) {
			return x;
		}
		return 0;
	
	}
	}
		


