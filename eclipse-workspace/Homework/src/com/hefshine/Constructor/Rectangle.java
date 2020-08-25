package com.hefshine.Constructor;

public class Rectangle {
	
	int l,b,res;
	Rectangle()
	{
		System.out.println("Default constructor");
	}
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
		int area=l*b;
		System.out.println("Area is :" +area);
		
	}
	Rectangle(int lb)
	{
		res=l*b;
		System.out.println("Area is:" +res);
	}
	void calculateArea()
	{
		int area=l*b;
		System.out.println("Area is :" +area);
	}

}
