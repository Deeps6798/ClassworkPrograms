package com.hefshine.Method;

 class Square {
	public float area;
	float i=0.5f;

	void area(int side)
	{
		area=side*side;
		System.out.println("The area of square is: " +area);
	}
	
		void area(int length, int breadth)
		{
			area=length*breadth;
			System.out.println("The area of rectangle is:" +area);
			
		}
		
			void area(float base, float height)
			{
				area=i*base*height;
				System.out.println("The area of triagnle is :" +area);
				
			
		}
	}


