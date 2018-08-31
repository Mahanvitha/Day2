package com.capgemini.day2.tests;

public class NewAmount {
public static double DiscountCalculation(double itemPrice) {
	double discount;
	double newItemPrice;
	
	if(itemPrice>0) {
	discount = 35* itemPrice/100;
	newItemPrice = itemPrice-(discount);
		return newItemPrice;
	}
	else {
	return 0;
	}
	}

}
