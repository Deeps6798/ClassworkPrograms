package com.hefshine.Methods;

class Square{
	int len, area;
	
	 void CalArea(int l)
	 {
		 len=l;
		 area=l*l;
		 System.out.println("The area of square is:" +area);
	 }
}
public class SquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sd= new Square();
		sd.CalArea(8);
		
		

	}
}

