package com.capgemini.day2.tests;
public class palindromeCheck {

	public static boolean palindrome2(int num) {
		int rev=0,rem,value;
		value = num;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num /= 10;
		}
		if (value == rev)
			return true;
		else
			return false;
	}

}
