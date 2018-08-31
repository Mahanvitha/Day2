package com.capgemini.day2.testsjava;
public class MultiDimensionArray {

	public static Boolean mutliDimensionalArray(int[][] array, int toFind) {       
        for(int i=0;i<array.length;i++) 
        {
        for (int j=0;j<array[i].length;j++)
        {
        if(array[i][j]==toFind)
        {
        	return true;
        }
        }
        }
		return false;
        	
	}
	
}



    

