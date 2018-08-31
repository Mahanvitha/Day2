package com.capgemini.day2.tests;

public class ArmstrongRange1 {
public static int[] findAllArmstrongNumbers(int start, int end){
	int num;
	int digit;
	int sum =0;
	int index =0;
	int allArmsNumber[] = new int[10];
	for(int i= start;i<=end;i++) {
		num =i;
		sum =0;
		while(num!=0) {
			digit = num % 10;
			sum = sum +digit*digit*digit;
			num = num/10;
		}
	
		if(sum == i) 
	    allArmsNumber[index++]=i;

}
	return allArmsNumber;
}
}
