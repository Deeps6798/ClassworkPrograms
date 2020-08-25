package com.hefshine.Abstract;

abstract class Shape {
	abstract void numberofSides();

}

class Trapezoid extends Shape
{
	
	void numberofSides()
	{
		System.out.println("This is Trapezoid");
	}
}

class Triangle extends Shape
{
	void numberofSides()
	{
		System.out.println("This is Triangle");
	}
	
}
class Hexagon extends Shape
{
	void numberofSides()
	{
		System.out.println("This is Hexagon");
	}
	
	
}