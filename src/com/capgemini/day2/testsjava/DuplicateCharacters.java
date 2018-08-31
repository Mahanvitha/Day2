package com.capgemini.day2.testsjava;


public class DuplicateCharacters {

	public static String duplicateCharactersTest(String string) {
		
		   
		    int l = string.length();
		    char ch ;
		    String ans=" ";
		     
		    for(int i=0; i<l; i++)
		    {
		        ch = string.charAt(i);
		        if(ch!=' ')
		            ans = ans + ch;
		        string = string.replace(ch,' ');
		    }
		    return ans;
	}
	
}
		       
	
	

