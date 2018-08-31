package com.capgemini.day2.testsjava;



public class DateDisplay {

	public static String displayDateTest(String abc) {
		String s="";
		int month;
		String[] date=abc.split(",");
		month  = Integer.parseInt(date[1]);
		
		
		switch (month) {
		case 1: s="January";break;
		case 2: s="February";break;
		case 3: s="March";break;
		case 4: s="April";break;
		case 5: s="May";break;
		case 6: s="June";break;
		case 7: s="July";break;
		case 8: s="August";break;
		case 9: s="September";break;
		case 10: s="October";break;
		case 11: s="November";break;
		case 12: s="December";break;
		
		}
		return date[0]+"/"+s+"/"+date[2];
	}

}
