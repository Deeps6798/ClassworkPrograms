package com.morning.sessions;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentStatic s1= new StudentStatic(1,"Rani", "Kolhapur");
		s1.cnt=10;
		StudentStatic s2= new StudentStatic(2,"Raju", "Satara");
		s2.cnt=19;
		StudentStatic s3= new StudentStatic(3,"Revathi", "Kerala");
		s3.cnt=4;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
