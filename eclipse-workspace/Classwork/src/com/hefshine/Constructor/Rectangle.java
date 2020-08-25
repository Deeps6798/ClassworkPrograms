package com.hefshine.Constructor;

public class Rectangle {
	
	int l, w;
	
	Rectangle(int l, int w)
	{
		this.l=l;
		this.w=w;
		
	}
	
	void rectangleArea()
	{
		int area=l*w;
		System.out.println(area);
	}
	void rectanglePerimeter()
	{
		int perimeter=2*(l+w);
		System.out.println(perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle(10,10);
		r.rectangleArea();
		r.rectanglePerimeter();
		

	}

}
