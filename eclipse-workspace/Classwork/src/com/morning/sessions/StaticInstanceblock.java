package com.morning.sessions;

public class StaticInstanceblock {
	
	
	static
	{
		System.out.println("This is static block of parent ");
	}
	static
	{
		System.out.println("This is static block of child");
	}
	
	//Instance block
	{
		System.out.println("This is instance block of parent");
	}
	{
		System.out.println("This is instance block of child");
	}
	
	
	StaticInstanceblock()
	{
		System.out.println("This is a constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticInstanceblock s= new StaticInstanceblock();
		StaticInstanceblock s1= new StaticInstanceblock();
	}

}
