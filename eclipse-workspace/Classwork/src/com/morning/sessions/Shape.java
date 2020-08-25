package com.morning.sessions;


	public class Shape{
		void area(float a)
		{
			System.out.println("The area of Shape class: "  +a);
		}
		void m1()
		{
			System.out.println("This is method of parent class");
		}
		void mshape()
		{
			System.out.println("This is method of mshape");
		}
	}
	class Square extends Shape{
		public void area(float a)
		{
			System.out.println("area of Square class: "  +a*a);
		}
		void m1()
		{
			System.out.println("This is method of child class");
		}
		void m2()
		{
			System.out.println("This is method of child 2class");
		}
	}
	class Cube extends Square{
		public void area(float a)
		{
			System.out.println("Area of cube class: "  +a*a*a);
		}
	}
	class Circle extends Shape{
		public void area(float a)
		{
			System.out.println("Area of circle class: "  +3.14f*a*a);
		}
	}

	

