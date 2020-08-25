package com.morning.sessions;


abstract class Shape1
{
abstract float calArea(float a);
		void display()                      
		{
			System.out.println("This is abstrcat class");
		}
	}
	
  class Square1 extends Shape1
{	
	@Override 
	float calArea(float a)
	{
		return (a*a);
		
	}
	
	
}

 class Circle1 extends Shape1
{
	@Override
	float calArea(float a)
	{
		return (3.14f*a*a);
		
	}
}




public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
		Shape1 shape= new Square1();
		System.out.println(shape.calArea(9.0f));
		
		shape=new Circle1();
		System.out.println(shape.calArea(8.6f));
		
		
		
		
	}

}
