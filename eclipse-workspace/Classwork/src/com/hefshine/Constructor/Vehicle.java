package com.hefshine.Constructor;

public class Vehicle {
	String color;
	int wheelcnt;
	int gearscnt;
	Vehicle()
	{
		System.out.println("This is default constructor");
	}
	Vehicle(String color, int wheelcnt, int gearscnt)
	{
		this();
		this.color=color;
		this.wheelcnt=wheelcnt;
		this.gearscnt=gearscnt;
			
	}
	void display()
	{
		System.out.println("The color is: " +color);
		System.out.println("The wheelcnount is: " +wheelcnt);
		System.out.println("The gear is: " +gearscnt);	
	}

}

	
