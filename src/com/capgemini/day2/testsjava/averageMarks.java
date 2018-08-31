package com.capgemini.day2.testsjava;

import java.text.DecimalFormat;

public class averageMarks {

	public static double TotalMarksStd1(double sub1, double sub2,double sub3) {
	 return (sub1+sub2+sub3);
	}
   
    public static double TotalMarksStd2(int sub1, int sub2, int sub3) {
   	 return (sub1+sub2+sub3);
   	}
    
    public static double TotalMarksStd3(int sub1, int sub2, int sub3) {
   	 return (sub1+sub2+sub3);
   	}
    public static double AverageStd1(int sub1, int sub2, int sub3) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	double average;
    	average = (sub1+sub2+sub3/3);
    	average = Double.valueOf(df.format(average));
    	return average;
    }
    public static double AverageStd2(int sub1, int sub2, int sub3) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	double average;
    	average = (sub1+sub2+sub3/3);
    	average = Double.valueOf(df.format(average));
    	return average;
    }
    public static double AverageStd3(int sub1, int sub2, int sub3) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	double average;
    	average = (sub1+sub2+sub3/3);
    	average = Double.valueOf(df.format(average));
    	return average;
    }
public static double TotalMarksSub1(double sub1, double sub2,double sub3) {
	 return (sub1+sub2+sub3);
	}
  
   public static double TotalMarksSub2(int sub1, int sub2, int sub3) {
  	 return (sub1+sub2+sub3);
  	}
   
   public static double TotalMarksSub3(int sub1, int sub2, int sub3) {
  	 return (sub1+sub2+sub3);
  	} 
   public static double AverageSub1(int sub1, int sub2, int sub3) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	double average;
    	average = (sub1+sub2+sub3/3);
    	average = Double.valueOf(df.format(average));
    	return average;
    }
    public static double AverageSub2(int sub1, int sub2, int sub3) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	double average;
    	average = (sub1+sub2+sub3/3);
    	average = Double.valueOf(df.format(average));
    	return average;
    }
    public static double AverageSub3(int sub1, int sub2, int sub3) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	double average;
    	average = (sub1+sub2+sub3/3);
    	average = Double.valueOf(df.format(average));
    	return average;
    }
}