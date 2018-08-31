package com.capgemini.day2.tests;

public class SimpleCompound {

	public static double[] interestCalculation(double p, double t, double r) {
		double simple = (p*t*r)/100;
		double compound = (double) ((p*(Math.pow((1+(r/100)),t)))-p);
		double[] result = new double [2];
		result[0]= simple;
		result[1]= compound;
 		return result;
	}

}
