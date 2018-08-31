package com.capgemini.day2.testsjava;



public class CiuApp {

	public static boolean ciuAppCheck(String userid, String paswrd) {
	
		int n=0;
		while(n<3)
		{
	        for(int i=0;i<1;i++)
	        {
	    if(userid.equals(userid) && paswrd.equals(paswrd)) {
	    
	    	return true;
	   
	    }
	    }
		n++;
		}
	    if(n==3)
	    {
	    	System.out.println("Contact Admin");
	    }
		

		return false;
	}

}
