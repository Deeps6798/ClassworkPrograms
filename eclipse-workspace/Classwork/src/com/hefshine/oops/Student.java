package com.hefshine.oops;

public class Student {
	int id=  1;
	String name= "DS";
	
	void Study()
	{
		System.out.println("Student id:" +id);
		System.out.println("Student name:" +name);
		System.out.println("Maths study");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.Study();
		
		

	}

}
