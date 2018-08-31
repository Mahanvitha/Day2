package com.capgemini.day2.tests;

public class studentDeclaration {

	public static String resultDeclaration(int i, int j, int k) {
		int count=0;
		String pass="pass";
		String promoted = "promoted";
		String fail = "fail";
		
		if(i>0 && j>0 && k>0) {
		if(i>60) {
			count++;
		}
		if(j>60) {
			count++;
		}
		if(k>60) {
			count++;
		}
		}
		switch (count)
		{
		case 0:return fail;
		
		case 1:return fail;
		case 2:return (promoted+" "+pass);
		case 3:return pass;
		}
		return null;
	}

}
