package com.capgemini.day2.testsjava;

public class ArrayOfIntegers {

	public static boolean calculateArrayIntegers(int size, int[] integers) {
		int temp=0;
		for(int i=0;i<integers.length;i++) {
			temp=integers[i];
			for(int j=i+1;j<integers.length;j++) {
				if(integers[j]==temp)
				{
					if(Math.abs(j-i)<=size)
					{
						System.out.println(integers[j]+"at"+(i+1)+","+(j+1));
					}
				}
			}
		}

		return true;
	}

}
