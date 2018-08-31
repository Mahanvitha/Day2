package com.capgemini.day1;
import java.lang.Math;
public class Armstrong {
public static boolean checkArmstrongNumber(int number) {
	number=Math.abs(number);
	int temp = number,digit,sum=0;
	while(temp>0)
	{
		digit = temp%10;
		sum =  sum+(digit*digit*digit);
		temp /= 10;
	}
	if (sum == number)
	{
		System.out.println("True");
		return true;
	}
	
	else
	{
		System.out.println("False");
	}
	return false;
	}
}


