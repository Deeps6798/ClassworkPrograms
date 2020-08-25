package com.hefshine.Methods;

public class Cube {

	int height, width, depth, vol;
	void calvolume(int h, int w, int d)
	{	
		this.height=h;
		this.width=w;
		this.depth=d;
		vol=height*width*depth;
		System.out.println("The volume of cube is: " +vol);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c= new Cube();
		c.calvolume(2, 3, 6);;
		

	}

}
