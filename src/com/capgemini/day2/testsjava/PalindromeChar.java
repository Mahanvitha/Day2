package com.capgemini.day2.testsjava;

public class PalindromeChar {

	public static String palindromeCharTest(String[] chars) {
		int k=0, count=0;
		String b="";
		String temp ="";
		String palindromeString="";
	    String palindromes[] = new String[10];
	    for(int i=0;i<10;i++) {
	    	int n = chars[i].length();
	    	for(int j=n-1;j>=0;j--)
	    	{
	    		b = b + chars[i].charAt(j);
	    	}
	    	if(chars[i].equals(b))
	    	{
	    		count++;
	    		palindromes[k]=chars[i];
	    		k++;
	    	}
	    	b="";
	    }
	  
	    for(int j=0;j<count-1;j++) {
	    	for(int i=0; i<count-j-1;i++) {
	    		int n =palindromes[i].length();
	    		int m =palindromes[i+1].length();
	    		if(n>m) {
	    			temp = palindromes[i+1];
	    			palindromes[i+1] = palindromes[i];
	    			palindromes[i] = temp;
	    		}
	    	}
	    }
	
	    for(int i =0;i<count;i++) {
//	    	int n = palindromes[i].length();
	    	palindromeString+=palindromes[i]+" ";
	    }

	
		return palindromeString ;
	}
}

