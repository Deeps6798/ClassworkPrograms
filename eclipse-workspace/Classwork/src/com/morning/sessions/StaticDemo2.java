package com.morning.sessions;
public class StaticDemo2 {
	int a1,b1;
	static int x1,x2;
	StaticDemo2()
	{
		this.a1=0;
		this.b1=0;
		StaticDemo2.x1=0;
		StaticDemo2.x2=0;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo2 d1= new StaticDemo2();
		d1.a1=23;
		d1.x1=10;
		
		StaticDemo2 d2= new StaticDemo2();
		d1.x1=121;
		d2.x1=11;
		StaticDemo2.x1=23;
		
		StaticDemo2 d3= new StaticDemo2();
		d3.a1=45;
		StaticDemo2.x1=47;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	
	}

}
