package com.hefshine.HasA;

public class MainCupboard{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cupboard c = new Cupboard();
			
		Item i= new Item();
		i.id=20;
		i.brand="Godrej";
		i.cost=25000;
			
		
		Rack1 r= new Rack1();
		r.id=1;
		
		
		c.id=100;
		c.name="Green Plywood";
		c.height=4.5f;
		c.width=3.0f;
	///	c.r=r;
		
		
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.height);
		System.out.println(c.width);
		//System.out.println(c.r.id);
		//System.out.println(c.id);
	//	System.out.println(c.name);
		//System.out.println(c.cost);
		System.out.println(i.id);
		System.out.println(i.brand);
		System.out.println(i.cost);
		System.out.println(r.id);
		
		
		
		
		
				
		

	}

}
