package com.morning.sessions;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape parent= new Shape();
		Square child_sq= new Square();
		Cube c= new Cube();
		Circle cr= new Circle();
		
		/*s.area(56.99f);
		sq.area(876.9f);
		c.area(67.1f);
		cr.area(23.3f);
		*/
		
		parent=(Shape)child_sq;
		parent.area(88.1f);
		parent.m1();
		parent.mshape();
		
		
		

	}

}
