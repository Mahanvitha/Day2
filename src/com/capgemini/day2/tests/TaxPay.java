package com.capgemini.day2.tests;

public class TaxPay {

	public static double incomeTax(double ctc) {
		double tax = 0;
		if(ctc>=0  && ctc<=180000) {
	        tax = ctc;
		}
		if(ctc>=181000 && ctc<=300000) {
			tax = ctc/10;
			
		} 
		if(ctc>300000 && ctc<=500000) {
			tax = ctc/5;
			
		}
		if(ctc>=500001 && ctc<=1000000) {
			tax = ctc*3/10;
		}
		else if(ctc<=0 && ctc>10000000){
		return 0;
		}
		return tax;
	}
	}



