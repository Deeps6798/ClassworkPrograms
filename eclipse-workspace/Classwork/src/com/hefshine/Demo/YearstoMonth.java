package com.hefshine.Demo;



public class YearstoMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year , days=373 , months, week,m;
		
	
		
	year=days/365;
		
			System.out.println("Print year: " +year);
		
		m=days%365;
		
			
			week=m/7;
			System.out.println("Print Week: " +week);
			days=m%7;
			System.out.println("Print day: " +days);
			
		

	}

}
